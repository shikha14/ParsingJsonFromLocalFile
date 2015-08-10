package com.android.shikha.jsonparsingexample.framework.object;

/**
 * Created by shikha on 26/7/15.
 */
public class ResultObject implements java.io.Serializable {

   private GeometryObject geometry;
    private String icon;
    private String name;
    private String description ;

    public GeometryObject getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryObject geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
