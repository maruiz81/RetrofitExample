package com.example.retrofit.retrofitexample.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Coord {

    @JsonIgnoreProperties(ignoreUnknown = true)

    private Double lon;

    private Double lat;

    /**
     * @return The lon
     */
    public Double getLon() {
        return lon;
    }

    /**
     * @param lon The lon
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * @return The lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * @param lat The lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

}
