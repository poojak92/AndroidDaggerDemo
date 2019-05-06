package com.demo1.module;

import com.demo1.util.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Lars", "Vogel");
    }



}
