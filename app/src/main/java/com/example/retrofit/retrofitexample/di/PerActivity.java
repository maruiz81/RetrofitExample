package com.example.retrofit.retrofitexample.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by migue on 26/07/2016.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {

}
