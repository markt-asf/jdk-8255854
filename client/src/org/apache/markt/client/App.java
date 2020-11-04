package org.apache.markt.client;

import org.apache.markt.api.MyService;

public class App {

    public static void main(String[] args) throws Exception {
        MyService myService = MyService.newInstance();
        System.out.println(myService.doStuff());
    }
}
