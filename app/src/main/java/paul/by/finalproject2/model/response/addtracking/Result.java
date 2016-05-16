
package paul.by.finalproject2.model.response.addtracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("tracking")
    @Expose
    public Tracking tracking;

}
