package paul.by.finalproject2.server.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Paul on 28.12.2015.
 */
public class SourceParams {

    @SerializedName("jsonrpc_id")
    String jsonrpcId;
    String method;
    Params params;
    String id;

    public SourceParams() {

    }

    public SourceParams(String jsonrpcId, String method, Params params, String id) {
        this.jsonrpcId = jsonrpcId;
        this.method = method;
        this.params = params;
        this.id = id;
    }
}
