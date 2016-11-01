package com.example.retrofit.retrofitexample.domain.services.apiinterfaces;

import com.example.retrofit.retrofitexample.domain.model.CurrentWeatherModel;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by maruiz on 22/05/16.
 */
public interface CurrentWeatherApi {

    @GET("weather?units=metric&apikey=" + Configuration.API_KEY)
    Observable<CurrentWeatherModel> getCurrentWeather(@Query("q") final String city);

}
