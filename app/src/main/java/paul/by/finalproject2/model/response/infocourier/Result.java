package paul.by.finalproject2.model.response.infocourier;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 28.12.2015.
 */
public class Result {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("tracking_number")
    @Expose
    private String trackingNumber;
    @SerializedName("couriers")
    @Expose
    private List<Courier> couriers = new ArrayList<Courier>();

    /**
     *
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

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
     *     The couriers
     */
    public List<Courier> getCouriers() {
        return couriers;
    }

    /**
     *
     * @param couriers
     *     The couriers
     */
    public void setCouriers(List<Courier> couriers) {
        this.couriers = couriers;
    }


}
