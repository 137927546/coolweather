package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liubo on 2020/5/18
 */
public class Basic {
    @SerializedName("city")  //city 与  cityName   利用@SerializedName注解方式市JSON和Java字段建立映射关系
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
