package com.demo1.inject;

import com.demo1.util.User;

import javax.inject.Inject;
import javax.inject.Named;


public class BackendService {



    public String serverUrl;

    @Inject
    public BackendService(@Named("serverUrl") String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public boolean callServer(User user) {
       // System.out.println("P111"+"User: " + user.toString() );
        System.out.println("P111"+"serverUrl: " + serverUrl);

        if (user !=null && serverUrl!=null && serverUrl.length()>0) {
            System.out.println("P111"+"User: " + user + " ServerUrl: "  + serverUrl);
            return true;
        }
        return false;
    }
}
