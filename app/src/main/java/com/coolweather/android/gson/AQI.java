package com.coolweather.android.gson;

/**
 * Created by liubo on 2020/5/18
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
