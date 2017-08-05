package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * ====================================
 * 作   者：钟 易
 * <p>
 * 版   本：1.0
 * <p>
 * 创建日期：2017/8/5 22:31.
 * <p>
 * 描   述：
 * ====================================
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
