package com.example.retrofit.retrofitexample.di.component;

import com.example.retrofit.retrofitexample.di.PerActivity;
import com.example.retrofit.retrofitexample.di.module.MainActivityModule;
import com.example.retrofit.retrofitexample.presentation.presenter.MainPresenter;
import com.example.retrofit.retrofitexample.presentation.view.MainActivity;

import dagger.Component;

/**
 * Created by migue on 26/07/2016.
 */
@PerActivity
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    MainPresenter provideMainPresenter();

    void inject(MainActivity activity);
}

