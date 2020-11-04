package org.apache.markt.impl;

import org.apache.markt.api.MyService;
import org.apache.markt.api.Type;
import org.apache.markt.internal.SubType;
import org.apache.markt.util.Internal;


public class MyServiceImpl extends MyService {

    private final Internal internal = new Internal();

    public MyServiceImpl() {
        internal.setData("start");
    }

    @Override
    public Type doStuff() {
        return new SubType();
    }
}
