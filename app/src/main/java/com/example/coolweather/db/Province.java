package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * ====================================
 * 作   者：钟 易
 * <p>
 * 版   本：1.0
 * <p>
 * 创建日期：2017/8/5 13:50.
 * <p>
 * 描   述：
 * ====================================
 */

public class Province extends DataSupport {

    private int id;  //id 是自动增长的

    private String provinceName;  //省的名字

    private int provinceCode;  //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
