package paul.by.finalproject2.server;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmList;
import paul.by.finalproject2.controller.Constants;
import paul.by.finalproject2.controller.MessageTrackNumber;
import paul.by.finalproject2.model.response.ManagerResult;
import paul.by.finalproject2.server.api.IApiMethods;
import paul.by.finalproject2.server.request.SourceParams;
import paul.by.finalproject2.server.request.ManagerRequsetForCourier;
import paul.by.finalproject2.server.request.ManagerRequsetForTracking;
import paul.by.finalproject2.model.response.infocourier.Courier;
import paul.by.finalproject2.model.response.infocourier.InfoTracking;
import paul.by.finalproject2.model.response.resultsoftracking.Checkpoint;
import paul.by.finalproject2.model.response.resultsoftracking.ResultsTracking;
import paul.by.finalproject2.ui.notification.StatusNotification;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Paul on 28.12.2015.
 */
public class TrackingIntentService extends IntentService {

    public static final String TAG = "TAG";
    private final String[] courier = new String[1];
    private Retrofit mRetrofit = ServiceHelper.getInstance().getRetrofit();


    public TrackingIntentService() {
        super(TrackingIntentService.class.getName());
    }


    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected void onHandleIntent(Intent intent) {

//       Use track number from edit text to start service. Example: "RI 762 133 845 CN";
        String trackNumber = intent.getStringExtra(Constants.TRACK_NUMBER);

        getCourier(trackNumber);
        addTracking(trackNumber);
        trackingParcel(trackNumber);

    }

    //this method detect courier of track number
    public void getCourier(String trackNumber) {
        StatusNotification nf = new StatusNotification();
        nf.createProgressNotification(getApplicationContext());

        ManagerRequsetForCourier manager = new ManagerRequsetForCourier();
        SourceParams params = manager.infoForCourier(1, Constants.METHOD_DETECT_COURIER, trackNumber);
        IApiMethods myApi = mRetrofit.create(IApiMethods.class);


        Call<InfoTracking> call = myApi.getCourier(params);
        try {
            Response<InfoTracking> infoTracking = call.execute();
            List<Courier> couriers = infoTracking.body().getResult().getCouriers();
            Log.d(TAG, "courier " + couriers.get(0).getSlug());
            courier[0] = couriers.get(0).getSlug();
            threadSleep();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //this method add track number to server for checking
    public void addTracking(String trackNumber) {
        ManagerRequsetForTracking manager = new ManagerRequsetForTracking();
        SourceParams params = manager.infoForTracking(2, Constants.METHOD_ADD_TRACKING, trackNumber, "title", courier[0]);

        IApiMethods myApi = mRetrofit.create(IApiMethods.class);
        myApi.addTrackingInfo(params);
        threadSleep();


    }

    //this method return result about track number
    public void trackingParcel(String trackNumber) {

        ManagerRequsetForTracking manager = new ManagerRequsetForTracking();
        SourceParams params = manager.infoForTracking(3, Constants.METHOD_GET_TRACKING, trackNumber, "title", courier[0]);

        IApiMethods myApi = mRetrofit.create(IApiMethods.class);
        myApi.getTrackingInfo(params);


        RealmList<StatusTracking> listTracking = new RealmList<>();

        Call<ResultsTracking> call = myApi.getTrackingInfo(params);
        try {
            Response<ResultsTracking> resultsTracking = call.execute();
            List<Checkpoint> checkpoints = resultsTracking.body().getResult().getCheckpoints();

            StatusTracking[] statusTrackings = new StatusTracking[checkpoints.size()];

            Realm lastTrackRealm = Realm.getDefaultInstance();
            lastTrackRealm.beginTransaction();

//        ManagerResult managerResult = lastTrackRealm.createObject(ManagerResult.class);
            ManagerResult managerResult = new ManagerResult();
            managerResult.setTrackNumber(trackNumber);


            for (int i = 0; i < checkpoints.size(); i++) {
                Log.d(TAG, "=========== " + i + " ==========");
                Log.d(TAG, "Time " + checkpoints.get(i).getTime());
                Log.d(TAG, "Status " + checkpoints.get(i).getStatus());
                Log.d(TAG, "Location " + checkpoints.get(i).getLocation());
                Log.d(TAG, "Location_RU " + checkpoints.get(i).getLocationRu());
                Log.d(TAG, "Zip_code " + checkpoints.get(i).getZipCode());
                Log.d(TAG, "Country Code " + checkpoints.get(i).getCountryCode());
                Log.d(TAG, "Country_slug " + checkpoints.get(i).getCourierSlug());
                Log.d(TAG, "Message " + checkpoints.get(i).getMessage());

                String date = checkpoints.get(i).getTime();
                String currentLocation = checkpoints.get(i).getMessage() + " " + checkpoints.get(i).getLocationRu();


                statusTrackings[i] = new StatusTracking();
                statusTrackings[i].setDate(date);
                statusTrackings[i].setCurrentLocation(currentLocation);
                listTracking.add(statusTrackings[i]);

            }

            managerResult.setList(listTracking);

            lastTrackRealm.copyToRealmOrUpdate(managerResult);
            lastTrackRealm.commitTransaction();


//        RealmResults<StatusTracking> query = lastTrackRealm.where(StatusTracking.class).findAll();
            Log.d(TAG, "query ");

//        ServiceHelper.getBus().post(statusTrackings);

//        ServiceHelper.getBus().post(trackNumber);
            ServiceHelper.getBus().post(new MessageTrackNumber(trackNumber));
            Log.d(TAG, "adapter ");

            StatusNotification nf = new StatusNotification();
            nf.createDoneNotification(getApplicationContext());
            nf.cancelNotification(getApplicationContext(), StatusNotification.PROGRESS_NOTIFICATION_ID);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void threadSleep() {
        try {
            Log.d(TAG, "Sleep");
            Thread.sleep(Constants.TIMEOUT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
