
package paul.by.finalproject2.model.response.addtracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tracking {

    @SerializedName("tracking_number")
    @Expose
    public String trackingNumber;
    @SerializedName("courier_slug")
    @Expose
    public String courierSlug;

}
