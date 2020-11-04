package org.apache.markt.api;

import java.util.ServiceLoader;

public abstract class MyService {

    public static MyService newInstance() {
        ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);
        return serviceLoader.iterator().next();
    }

    String getVersion() {
        return "1.0";
    }

    public abstract Type doStuff();
}
