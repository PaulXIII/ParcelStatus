package paul.by.finalproject2.model.response.infocourier;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Paul on 28.12.2015.
 */
public class InfoTracking {

    @SerializedName("jsonrpc")
    @Expose
    private String jsonrpc;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("result")
    @Expose
    private Result result;

    /**
     *
     * @return
     *     The jsonrpc
     */
    public String getJsonrpc() {
        return jsonrpc;
    }

    /**
     *
     * @param jsonrpc
     *     The jsonrpc
     */
    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    /**
     *
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The result
     */
    public Result getResult() {
        return result;
    }

    /**
     *
     * @param result
     *     The result
     */
    public void setResult(Result result) {
        this.result = result;
    }

}
