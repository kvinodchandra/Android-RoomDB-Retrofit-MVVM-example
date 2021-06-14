package com.hopeitservice.demo.Dagger;

import com.hopeitservice.demo.Hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
