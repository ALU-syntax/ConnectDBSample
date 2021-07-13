package com.example.connectdbsample.API;

import com.example.connectdbsample.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("retrieve.php")
    Call<ResponseModel> artRetrieveData();
}
