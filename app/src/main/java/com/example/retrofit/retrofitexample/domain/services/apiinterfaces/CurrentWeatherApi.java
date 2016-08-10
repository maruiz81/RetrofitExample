package com.example.retrofit.retrofitexample.domain.services.apiinterfaces;

import com.example.retrofit.retrofitexample.domain.model.CurrentWeatherModel;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by maruiz on 22/05/16.
 */
public interface CurrentWeatherApi {

    static final String API_KEY = "bd67a27583fd276002bbb0c5c25a7061";

    @GET("weather?units=metric&apikey=" + API_KEY)
    Observable<CurrentWeatherModel> getCurrentWeather(@Query("q") final String city);

}
