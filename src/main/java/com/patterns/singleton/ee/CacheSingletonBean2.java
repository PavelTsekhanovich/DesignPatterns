package com.patterns.singleton.ee;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Startup;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Startup
@DependsOn("MyLoggingBean")
@Singleton
public class CacheSingletonBean2 {

    private Map<Integer,String> myCache;

    @EJB
    MyLoggingBean loggingBean;

    public void start(){
        loggingBean.logInfo("Started!");
        myCache = new HashMap<Integer, String>();
    }

    public void addUser(Integer id, String name){
        myCache.put(id, name);
    }

    public String getName(Integer id){
        return myCache.get(id);
    }
}
