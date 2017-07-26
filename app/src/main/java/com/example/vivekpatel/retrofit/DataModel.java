package com.example.vivekpatel.retrofit;


public class DataModel
{
    ResultModel data;


    public DataModel(ResultModel data) {
        this.data = data;
    }

    public ResultModel getData() {
        return data;
    }

    public void setData(ResultModel data) {
        this.data = data;
    }
}
