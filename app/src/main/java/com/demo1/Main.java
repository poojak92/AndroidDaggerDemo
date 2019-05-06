package com.demo1;

import com.demo1.component.DaggerMyComponent;
import com.demo1.component.MyComponent;
import com.demo1.inject.BackendService;
import com.demo1.util.User;

import javax.inject.Inject;


public class Main {

    @Inject
    BackendService backendService; //

    @Inject
    User user;

    private MyComponent component;

    public Main(){
        component= DaggerMyComponent.builder().build();
        component.inject(this);

    }
    public void callServer() {
        boolean callServer = backendService.callServer(user);
        if (callServer) {
            System.out.println("P1: "+"Server call was successful. ");
        } else {
            System.out.println("P11"+"Server call failed. ");
        }
    }

}
