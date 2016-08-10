package com.example.retrofit.retrofitexample.di.module;

import com.example.retrofit.retrofitexample.di.PerActivity;
import com.example.retrofit.retrofitexample.domain.interactor.CurrentWeatherInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by migue on 26/07/2016.
 */
@Module
public class MainActivityModule {

    @Provides
    @PerActivity
    public CurrentWeatherInteractor provideValidator() {
        return new CurrentWeatherInteractor();
    }
}
