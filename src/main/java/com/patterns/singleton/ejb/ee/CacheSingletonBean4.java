package com.patterns.singleton.ejb.ee;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Startup
@DependsOn("MyLoggingBean")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
@AccessTimeout(value = 120000)
public class CacheSingletonBean4 {

    private Map<Integer, String> myCache;

    @EJB
    MyLoggingBean loggingBean;

    @PostConstruct
    public void start(){
        loggingBean.logInfo("Started!");
        myCache = new HashMap<Integer, String>();
    }

    @AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
    @Lock(LockType.WRITE)
    public void addUser(Integer id, String name){
        myCache.put(id, name);
    }

    @Lock(LockType.READ)
    public String getName(Integer id){
        return myCache.get(id);
    }
}
