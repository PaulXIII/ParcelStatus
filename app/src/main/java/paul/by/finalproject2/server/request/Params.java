package paul.by.finalproject2.server.request;

/**
 * Created by Paul on 28.12.2015.
 */
public class Params {
    String tracking_number;
    Tracking tracking;

    public Params() {
    }

    public Params(String tracking_number) {
        this.tracking_number = tracking_number;
    }

    public Params(Tracking tracking) {
        this.tracking = tracking;
    }
}
