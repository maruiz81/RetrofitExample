package com.example.retrofit.retrofitexample.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Wind {

    @JsonIgnoreProperties(ignoreUnknown = true)

    private Double speed;

    private Integer deg;

    /**
     * @return The speed
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * @param speed The speed
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * @return The deg
     */
    public Integer getDeg() {
        return deg;
    }

    /**
     * @param deg The deg
     */
    public void setDeg(Integer deg) {
        this.deg = deg;
    }

}
