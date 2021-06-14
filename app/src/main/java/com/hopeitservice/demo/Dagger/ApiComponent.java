package com.hopeitservice.demo.Dagger;

import com.hopeitservice.demo.MainActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent {
    void inject(MainActivity mainActivity);
}
