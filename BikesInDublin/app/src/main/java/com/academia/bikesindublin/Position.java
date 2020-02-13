package com.academia.bikesindublin;

import com.google.gson.annotations.SerializedName;

public class Position {

    @SerializedName("lat")
    private double latitude;

    @SerializedName("lng")
    private double longitude;

    public Position() {
    }

    public Position(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
