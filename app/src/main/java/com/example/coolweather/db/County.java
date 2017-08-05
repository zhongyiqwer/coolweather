package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * ====================================
 * 作   者：钟 易
 * <p>
 * 版   本：1.0
 * <p>
 * 创建日期：2017/8/5 13:57.
 * <p>
 * 描   述：
 * ====================================
 */

public class County extends DataSupport {

    private int id;  //id 是自动增长的

    private String countyName;

    private String weatherId;  //记录当前县所对应天气的id

    private int cityId;        //记录当前县所属的城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
