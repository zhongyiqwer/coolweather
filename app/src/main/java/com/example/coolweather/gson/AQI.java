package com.example.coolweather.gson;

/**
 * ====================================
 * 作   者：钟 易
 * <p>
 * 版   本：1.0
 * <p>
 * 创建日期：2017/8/5 22:27.
 * <p>
 * 描   述：
 * ====================================
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String api;

        public String pm25;
    }
}
