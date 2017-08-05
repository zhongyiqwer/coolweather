package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * ====================================
 * 作   者：钟 易
 * <p>
 * 版   本：1.0
 * <p>
 * 创建日期：2017/8/5 22:23.
 * <p>
 * 描   述：
 * ====================================
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
