package com.demo1.component;

import com.demo1.Main;
import com.demo1.inject.BackendService;
import com.demo1.module.BackEndServiceModule;
import com.demo1.module.UserModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UserModule.class, BackEndServiceModule.class })
public interface MyComponent {

    // provide the dependency for dependent components
    // (not needed for single-component setups)

    BackendService provideBackendService();

    // allow to inject into our Main class
    // method name not important
    void inject(Main main);
}
