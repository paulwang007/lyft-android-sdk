package com.lyft.networking.apiObjects;

import com.google.gson.annotations.SerializedName;

public class LatLng {

    @SerializedName("lat")
    public final Double lat;

    @SerializedName("lng")
    public final Double lng;

    public LatLng(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LatLng {\n");

        sb.append("  lat: ").append(lat).append("\n");
        sb.append("  lng: ").append(lng).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
