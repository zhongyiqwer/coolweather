package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * ====================================
 * 作   者：钟 易
 * <p>
 * 版   本：1.0
 * <p>
 * 创建日期：2017/8/5 13:54.
 * <p>
 * 描   述：
 * ====================================
 */

public class City extends DataSupport {

    private int id;  //id 是自动增长的

    private String cityName;

    private int cityCode;

    private int provinceId; //城市所属省的Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
