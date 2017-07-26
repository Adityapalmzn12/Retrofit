package com.example.vivekpatel.retrofit;


public class UserModel
{
    private String name;

    public UserModel(String name, String job) {
        this.name = name;
        this.job = job;
    }

    private  String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
