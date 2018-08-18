package com.hzyice.ajaxserver.controller;


public class ResultBean {
    private String data;

    public ResultBean(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "data='" + data + '\'' +
                '}';
    }
}
