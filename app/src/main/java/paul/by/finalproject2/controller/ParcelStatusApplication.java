package paul.by.finalproject2.controller;

import android.app.Application;
import android.location.Location;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.internal.Table;

/**
 * Created by Павел on 23.04.2016.
 */
public class ParcelStatusApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }





}
