package com.example.retrofit.retrofitexample.presentation.presenter;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.retrofit.retrofitexample.domain.interactor.CurrentWeatherInteractor;
import com.example.retrofit.retrofitexample.domain.model.CurrentWeatherModel;
import com.example.retrofit.retrofitexample.presentation.view.BaseView;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

import rx.Subscriber;

/**
 * Created by migue on 06/07/2016.
 */
public class MainPresenter {

    private static final String TAG = "MainPresenter";

    private WeakReference<BaseView> mView;

    private CurrentWeatherInteractor mService;

    @Inject
    public MainPresenter(final CurrentWeatherInteractor service) {
        mService = service;
    }

    public void onStart(@NonNull BaseView view) {
        bindView(view);
    }

    public void onStop() {
        unbindView();
    }

    public BaseView getView() {
        if (mView == null) {
            return null;
        } else {
            return mView.get();
        }
    }

    public void requestDataFromServer(final String city) {

        mService.execute(city, new Subscriber<CurrentWeatherModel>() {

            @Override
            public void onCompleted() {
                Log.d(TAG, "On Completed");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "Error", e);
            }

            @Override
            public void onNext(CurrentWeatherModel currentWeatherModel) {
                getView().setCity(currentWeatherModel.getName());
                getView().setTemperature(Math.round(currentWeatherModel.getMain().getTemp()));
                getView().setMaxTemperature(Math.round(currentWeatherModel.getMain().getTempMax()));
                getView().setMinTemperature(Math.round(currentWeatherModel.getMain().getTempMin()));
            }

        });
    }

    private void bindView(@NonNull BaseView view) {
        mView = new WeakReference<>(view);
    }

    private void unbindView() {
        mService.cancel();
        mView = null;
    }

}
