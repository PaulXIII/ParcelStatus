
package paul.by.finalproject2.model.response.resultsoftracking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Extra {

    @SerializedName("courier_slug")
    @Expose
    private String courierSlug;
    @SerializedName("data")
    @Expose
    private Data data;

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
     *     The data
     */
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = data;
    }

}
