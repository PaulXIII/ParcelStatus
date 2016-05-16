
package paul.by.finalproject2.model.response.resultsoftracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {

    @SerializedName("tracking_number")
    @Expose
    private String trackingNumber;
    @SerializedName("courier_slug")
    @Expose
    private String courierSlug;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("is_delivered")
    @Expose
    private Boolean isDelivered;
    @SerializedName("last_check")
    @Expose
    private String lastCheck;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("checkpoints")
    @Expose
    private List<Checkpoint> checkpoints = new ArrayList<Checkpoint>();
    @SerializedName("extra")
    @Expose
    private List<Extra> extra = new ArrayList<Extra>();

    /**
     * 
     * @return
     *     The trackingNumber
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * 
     * @param trackingNumber
     *     The tracking_number
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * 
     * @return
     *     The courierSlug
     */
    public String getCourierSlug() {
        return courierSlug;
    }

    /**
     * 
     * @param courierSlug
     *     The courier_slug
     */
    public void setCourierSlug(String courierSlug) {
        this.courierSlug = courierSlug;
    }

    /**
     * 
     * @return
     *     The isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * 
     * @param isActive
     *     The is_active
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * 
     * @return
     *     The isDelivered
     */
    public Boolean getIsDelivered() {
        return isDelivered;
    }

    /**
     * 
     * @param isDelivered
     *     The is_delivered
     */
    public void setIsDelivered(Boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    /**
     * 
     * @return
     *     The lastCheck
     */
    public String getLastCheck() {
        return lastCheck;
    }

    /**
     * 
     * @param lastCheck
     *     The last_check
     */
    public void setLastCheck(String lastCheck) {
        this.lastCheck = lastCheck;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The checkpoints
     */
    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    /**
     * 
     * @param checkpoints
     *     The checkpoints
     */
    public void setCheckpoints(List<Checkpoint> checkpoints) {
        this.checkpoints = checkpoints;
    }

    /**
     * 
     * @return
     *     The extra
     */
    public List<Extra> getExtra() {
        return extra;
    }

    /**
     * 
     * @param extra
     *     The extra
     */
    public void setExtra(List<Extra> extra) {
        this.extra = extra;
    }

}
