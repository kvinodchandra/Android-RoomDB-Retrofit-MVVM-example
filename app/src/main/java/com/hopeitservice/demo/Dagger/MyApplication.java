package com.hopeitservice.demo.Dagger;

import android.app.Application;

public class MyApplication extends Application {
    private ApiComponent apiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        apiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://simplifiedcoding.net/demos/"))
                .build();
    }
    public ApiComponent getNetComponent() {
        return apiComponent;
    }
}
