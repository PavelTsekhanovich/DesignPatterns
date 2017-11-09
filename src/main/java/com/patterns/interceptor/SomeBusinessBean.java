package com.patterns.interceptor;

import java.util.logging.Logger;

@Secure
public class SomeBusinessBean {

    public void startService() {
        // Complex business logic
        Logger.getLogger("AppLog").info("done...");
    }

    public void startAnotherService() {
        // Complex business logic
        Logger.getLogger("AppLog").info("done again...");
    }
}
   
