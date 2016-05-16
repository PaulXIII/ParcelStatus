package paul.by.finalproject2.server.request;

/**
 * Created by Paul on 28.12.2015.
 */
public class Tracking {

    String tracking_number;
    String courier_slug;
    String title;

    public Tracking(String tracking_number, String courier_slug, String title) {
        this.tracking_number = tracking_number;
        this.courier_slug = courier_slug;
        this.title = title;
    }


}
