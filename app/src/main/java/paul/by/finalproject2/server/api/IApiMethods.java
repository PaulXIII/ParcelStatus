package paul.by.finalproject2.server.api;

import paul.by.finalproject2.model.response.addtracking.AddTrackingResponse;
import paul.by.finalproject2.model.response.infocourier.InfoTracking;
import paul.by.finalproject2.model.response.resultsoftracking.ResultsTracking;
import paul.by.finalproject2.server.request.SourceParams;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Павел on 07.04.2016.
 */
public interface IApiMethods {

    @POST("jsonrpc")
    Call<InfoTracking> getCourier (@Body SourceParams params);

    @POST("jsonrpc")
    Call<AddTrackingResponse> addTrackingInfo (@Body SourceParams params);

    @POST("jsonrpc")
    Call<ResultsTracking> getTrackingInfo (@Body SourceParams params);

}
