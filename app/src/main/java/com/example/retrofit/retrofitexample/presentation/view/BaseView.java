package com.example.retrofit.retrofitexample.presentation.view;

/**
 * Created by migue on 06/07/2016.
 */
public interface BaseView {
    void setCity(final String city);
    void setWeatherCondition(final String weatherCondition);
    void setTemperature(final int temperature);
    void setMinTemperature(final int minTemperature);
    void setMaxTemperature(final int maxTemperature);
}
