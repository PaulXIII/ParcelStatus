package paul.by.finalproject2.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.Subscribe;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import paul.by.finalproject2.R;
import paul.by.finalproject2.controller.Constants;
import paul.by.finalproject2.controller.MessageTrackNumber;
import paul.by.finalproject2.model.response.ManagerResult;
import paul.by.finalproject2.server.ServiceHelper;
import paul.by.finalproject2.server.StatusTracking;
import paul.by.finalproject2.server.TrackingIntentService;
import paul.by.finalproject2.ui.recyclerview.StatusTrackingAdapter;

/**
 * Created by Paul on 28.12.2015.
 */
public class TrackingParselFragment extends Fragment {

    private StatusTrackingAdapter mAdapter;
    private String trackNumber;
    private EditText editText;
    private LinearLayoutManager mLinearLayoutManager;
    private CoordinatorLayout mLayout;
    private SharedPreferences sharedPreferences;

    //Fragment when we show interface for input track number
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate register");
        setRetainInstance(true);
        mAdapter = new StatusTrackingAdapter();
        mLinearLayoutManager = new LinearLayoutManager(getActivity());

        ServiceHelper.getBus().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy unregister");
        ServiceHelper.getBus().unregister(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        saveTrackNumber();
    }

    @Override
    public void onResume() {
        super.onResume();
        loadTrackNumber();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_track, container, false);
        Button buttonStart = (Button) view.findViewById(R.id.btn_start);
        editText = (EditText) view.findViewById(R.id.edit_track);


        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.swapAdapter(mAdapter, false);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mLayout = (CoordinatorLayout) view.findViewById(R.id.linearLayout);


        buttonStart.setOnClickListener(listener);
        setRetainInstance(true);
        return view;
    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            InputMethodManager inputMgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMgr.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            trackNumber = editText.getText().toString().toUpperCase();

            if (!TextUtils.isEmpty(trackNumber)) {
                if (isOnline()) {
                    Intent intentService = new Intent(getActivity(), TrackingIntentService.class);
                    intentService.putExtra(Constants.TRACK_NUMBER, trackNumber);
                    getActivity().startService(intentService);
                } else {
                    showSnackBar(getActivity().getResources().getString(R.string.no_internet_connection));

                }
            } else {
                showSnackBar(getActivity().getResources().getString(R.string.input_track_number));
            }

        }
    };


    //this method return result of work intent service
    @Subscribe
    public void resultList(MessageTrackNumber messageTrackNumber) {
        String trackNumber = messageTrackNumber.trackNumber;
        Log.d("TAG", "resultList+1");

        Realm realm = realm = Realm.getDefaultInstance();

        RealmResults<ManagerResult> query = realm.where(ManagerResult.class)
                .equalTo("trackNumber", trackNumber)
                .findAll();

        RealmList<StatusTracking> managerResult = query.get(0).getList();

        mAdapter.updateList(managerResult);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String trackNumber = editText.getText().toString();
        outState.putString("KEY", trackNumber);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            String trackNumber = savedInstanceState.getString("KEY");
            if (trackNumber != null) {
//                loadParcelInfo(trackNumber);
            }
        }

    }

    private void showSnackBar(String message) {
        Snackbar.make(mLayout, message, Snackbar.LENGTH_LONG)
                .setActionTextColor(Color.RED)
                .show();
    }

    private boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

    private void saveTrackNumber() {
        sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Constants.SAVE_TRACK_NUMBER, editText.getText().toString());
        editor.apply();
    }

    private void loadTrackNumber() {
        sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
        String savedTrackNumber = sharedPreferences.getString(Constants.SAVE_TRACK_NUMBER, "");
        editText.setText(savedTrackNumber);
    }

    private void loadParcelInfo(String tr) {
        Realm realm = Realm.getDefaultInstance();

        RealmResults<ManagerResult> query = realm.where(ManagerResult.class)
                .equalTo("trackNumber", tr)
                .findAll();

        RealmList<StatusTracking> managerResult = query.get(0).getList();

        mAdapter.updateList(managerResult);

    }


}
