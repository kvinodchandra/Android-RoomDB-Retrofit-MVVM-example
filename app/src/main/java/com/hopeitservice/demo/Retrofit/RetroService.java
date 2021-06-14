package com.hopeitservice.demo.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroService {

    @GET("/photos")
    Call<List<RetroModel>> getAllPhotos();
}
