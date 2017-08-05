package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * ====================================
 * 作   者：钟 易
 * <p>
 * 版   本：1.0
 * <p>
 * 创建日期：2017/8/5 22:39.
 * <p>
 * 描   述：返回天气所需要的数据类型
 * ====================================
 */

public class Weather {

    public String status;

    public Basic basic;

    public Now now;

    public AQI aqi;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
