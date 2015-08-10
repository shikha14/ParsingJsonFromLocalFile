package com.android.shikha.jsonparsingexample.framework.object;

/**
 * Created by shikha on 26/7/15.
 */
public class GeometryObject implements java.io.Serializable {

    private LocationObject location;

    public LocationObject getLocation() {
        return location;
    }

    public void setLocation(LocationObject location) {
        this.location = location;
    }
}
