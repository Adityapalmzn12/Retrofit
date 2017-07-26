package com.example.vivekpatel.retrofit;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface
{
    @GET("api/users/2")
    Call<DataModel> getDetail();



    @POST("api/users")   //post call.
    Call<ResultModel>  insert_user(@Body UserModel userModel);



}
