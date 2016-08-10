package com.example.retrofit.retrofitexample.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    @JsonIgnoreProperties(ignoreUnknown = true)

    private Float temp;

    private Integer pressure;

    private Integer humidity;

    @JsonProperty("temp_min")
    private Float tempMin;

    @JsonProperty("temp_max")
    private Float tempMax;

    /**
     * @return The temp
     */
    public Float getTemp() {
        return temp;
    }

    /**
     * @param temp The temp
     */
    public void setTemp(Float temp) {
        this.temp = temp;
    }

    /**
     * @return The pressure
     */
    public Integer getPressure() {
        return pressure;
    }

    /**
     * @param pressure The pressure
     */
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    /**
     * @return The humidity
     */
    public Integer getHumidity() {
        return humidity;
    }

    /**
     * @param humidity The humidity
     */
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    /**
     * @return The tempMin
     */
    public Float getTempMin() {
        return tempMin;
    }

    /**
     * @param tempMin The temp_min
     */
    public void setTempMin(Float tempMin) {
        this.tempMin = tempMin;
    }

    /**
     * @return The tempMax
     */
    public Float getTempMax() {
        return tempMax;
    }

    /**
     * @param tempMax The temp_max
     */
    public void setTempMax(Float tempMax) {
        this.tempMax = tempMax;
    }

}
