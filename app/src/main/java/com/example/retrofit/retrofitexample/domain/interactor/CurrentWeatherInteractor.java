package com.example.retrofit.retrofitexample.domain.interactor;

import com.example.retrofit.retrofitexample.domain.model.CurrentWeatherModel;
import com.example.retrofit.retrofitexample.domain.services.services.CurrentWeatherService;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/**
 * Created by maruiz on 23/05/16.
 */
public class CurrentWeatherInteractor {

    private static String TAG = "CurrentWeatherInteractor";

    private CurrentWeatherService mCurrentWeatherService = new CurrentWeatherService();

    private Subscription mSubscription = Subscriptions.empty();

    @Inject
    public CurrentWeatherInteractor() {

    }

    public void execute(final String city, final Observer<CurrentWeatherModel> observer) {

        Observable<CurrentWeatherModel> observable = mCurrentWeatherService.getAPI().getCurrentWeather(city);

        mSubscription = observable.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }

    public void cancel() {
        if (!mSubscription.isUnsubscribed()) {
            mSubscription.unsubscribe();
        }
    }

}