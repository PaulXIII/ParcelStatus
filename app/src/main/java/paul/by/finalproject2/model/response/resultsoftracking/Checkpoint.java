package paul.by.finalproject2.model.response.resultsoftracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Paul on 28.12.2015.
 */
public class Checkpoint {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("location_ru")
    @Expose
    private String locationRu;
    @SerializedName("zip_code")
    @Expose
    private Object zipCode;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("courier_slug")
    @Expose
    private String courierSlug;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     *
     * @return
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     *     The locationRu
     */
    public String getLocationRu() {
        return locationRu;
    }

    /**
     *
     * @param locationRu
     *     The location_ru
     */
    public void setLocationRu(String locationRu) {
        this.locationRu = locationRu;
    }

    /**
     *
     * @return
     *     The zipCode
     */
    public Object getZipCode() {
        return zipCode;
    }

    /**
     *
     * @param zipCode
     *     The zip_code
     */
    public void setZipCode(Object zipCode) {
        this.zipCode = zipCode;
    }

    /**
     *
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     *
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
