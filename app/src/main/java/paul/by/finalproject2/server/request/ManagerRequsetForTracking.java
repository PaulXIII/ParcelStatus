package paul.by.finalproject2.server.request;

import paul.by.finalproject2.server.request.Params;
import paul.by.finalproject2.server.request.SourceParams;
import paul.by.finalproject2.server.request.Tracking;

/**
 * Created by Paul on 28.12.2015.
 */
public class ManagerRequsetForTracking {

    public ManagerRequsetForTracking() {
    }

    public SourceParams infoForTracking(int id, String method, String trackNumber, String title, String courierSlug) {
        Tracking tracking = new Tracking(trackNumber, courierSlug, title);
        Params params = new Params(tracking);
        SourceParams sourceParams = new SourceParams("2.0", method, params, String.valueOf(id));
        return sourceParams;
    }

}
