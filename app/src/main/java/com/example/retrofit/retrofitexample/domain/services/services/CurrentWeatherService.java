package com.example.retrofit.retrofitexample.domain.services.services;

import com.example.retrofit.retrofitexample.domain.services.apiinterfaces.CurrentWeatherApi;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by maruiz on 22/05/16.
 */
public class CurrentWeatherService {

    private static String baseUrl = "http://api.openweathermap.org/data/2.5/";

    private CurrentWeatherApi currentWeatherApi;

    public CurrentWeatherService() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        Retrofit retrofit =
                new Retrofit.Builder().baseUrl(baseUrl).addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .addConverterFactory(JacksonConverterFactory.create(mapper)).build();

        currentWeatherApi = retrofit.create(CurrentWeatherApi.class);
    }

    public CurrentWeatherApi getAPI() {
        return currentWeatherApi;
    }

}
