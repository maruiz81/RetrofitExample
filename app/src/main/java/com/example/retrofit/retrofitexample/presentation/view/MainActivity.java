package com.example.retrofit.retrofitexample.presentation.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.retrofit.retrofitexample.R;
import com.example.retrofit.retrofitexample.di.component.DaggerMainActivityComponent;
import com.example.retrofit.retrofitexample.presentation.presenter.MainPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements BaseView {

    private static final String LONDON = "London";

    private final String TAG = "MainActivity";

    @BindView(R.id.location)
    TextView mCity;

    @BindView(R.id.temperature)
    TextView mTemperature;

    @BindView(R.id.max_temp)
    TextView mMaxTemperature;

    @BindView(R.id.min_temp)
    TextView mMinTemperature;

    @BindView(R.id.weather_description)
    TextView mWeatherConditions;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @Inject
    MainPresenter mPresenter;

    @Override
    public void setCity(final String city) {
        mCity.setText(city);
    }

    @Override
    public void setWeatherCondition(final String weatherCondition) {
        mWeatherConditions.setText(weatherCondition);
    }

    @Override
    public void setTemperature(final int temperature) {
        mTemperature.setText(getString(R.string.temperature, temperature));
    }

    @Override
    public void setMaxTemperature(final int maxTemperature) {
        mMaxTemperature.setText(getString(R.string.max_temp, maxTemperature));
    }

    @Override
    public void setMinTemperature(final int minTemperature) {
        mMinTemperature.setText(getString(R.string.min_temp, minTemperature));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeInjector();

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.requestDataFromServer(LONDON);
            }
        });

        mPresenter.requestDataFromServer(LONDON);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.onStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.onStop();
    }

    private void initializeInjector() {
        DaggerMainActivityComponent.builder().build().inject(this);
    }

}
