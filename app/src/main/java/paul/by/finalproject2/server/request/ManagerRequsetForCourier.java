package paul.by.finalproject2.server.request;

import paul.by.finalproject2.server.request.Params;
import paul.by.finalproject2.server.request.SourceParams;

/**
 * Created by Paul on 28.12.2015.
 */
public class ManagerRequsetForCourier {

    public ManagerRequsetForCourier() {
    }

    public SourceParams infoForCourier(int id, String method, String trackNumber) {
        Params params = new Params(trackNumber);
        SourceParams sourceParams = new SourceParams("2.0", method, params, String.valueOf(id));
        return sourceParams;
    }

}
