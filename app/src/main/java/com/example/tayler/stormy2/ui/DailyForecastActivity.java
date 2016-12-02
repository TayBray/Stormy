package com.example.tayler.stormy2.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.example.tayler.stormy2.R;
import com.example.tayler.stormy2.adapters.DayAdapter;
import com.example.tayler.stormy2.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}
