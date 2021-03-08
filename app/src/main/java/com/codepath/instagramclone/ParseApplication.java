package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Registers parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("T3c6rsWbXMDLIbnw4kfhwpubXOP7hpQqFlCerLVJ")
                .clientKey("VWnpT3wclrV0g65FcIx1J8Q3wS7MRBKgfjHfBqhD")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
