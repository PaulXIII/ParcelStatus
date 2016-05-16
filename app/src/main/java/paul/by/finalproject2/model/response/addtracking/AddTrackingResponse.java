
package paul.by.finalproject2.model.response.addtracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddTrackingResponse {

    @SerializedName("jsonrpc")
    @Expose
    public String jsonrpc;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("result")
    @Expose
    public Result result;

}
