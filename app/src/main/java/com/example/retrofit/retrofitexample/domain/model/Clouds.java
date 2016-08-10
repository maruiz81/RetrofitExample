package com.example.retrofit.retrofitexample.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Clouds {

    @JsonIgnoreProperties(ignoreUnknown = true)
    private Integer all;

    /**
     * @return The all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * @param all The all
     */
    public void setAll(Integer all) {
        this.all = all;
    }

}
