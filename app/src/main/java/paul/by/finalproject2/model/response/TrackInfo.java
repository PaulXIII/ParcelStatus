package paul.by.finalproject2.model.response;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import paul.by.finalproject2.server.StatusTracking;

/**
 * Created by Paul on 14.01.2016.
 */
public class TrackInfo extends RealmObject {


    @PrimaryKey
    private String trackNumber;


    private RealmList<StatusTracking> list;

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public RealmList<StatusTracking> getList() {
        return list;
    }

    public void setList(RealmList<StatusTracking> list) {
        this.list = list;
    }
}
