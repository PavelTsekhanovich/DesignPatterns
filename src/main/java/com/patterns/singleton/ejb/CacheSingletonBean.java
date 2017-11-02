package com.patterns.singleton.ejb;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.HashMap;
import java.util.Map;

@Startup
@Singleton
public class CacheSingletonBean {

    private Map<Integer, String> myCache;

    public void start() {
        myCache = new HashMap<Integer, String>();
    }

    public void addUser(Integer id, String name) {
        myCache.put(id, name);
    }

    public String getName(Integer id){
        return myCache.get(id);
    }
}
