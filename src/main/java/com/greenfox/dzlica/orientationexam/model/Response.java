package com.greenfox.dzlica.orientationexam.model;

import java.util.List;

public class Response {

    String result;
    List data;

    public Response(String result) {
        this.result = result;
    }

    public Response() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
