package paul.by.finalproject2.server;

import io.realm.RealmObject;

/**
 * Created by Paul on 28.12.2015.
 */
public class StatusTracking extends RealmObject {

    private String currentLocation;
    private String date;

    public StatusTracking() {

    }

    public StatusTracking(String currentLocation, String date) {
        this.currentLocation = currentLocation;
        this.date = date;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
