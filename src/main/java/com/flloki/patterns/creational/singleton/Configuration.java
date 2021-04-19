package com.flloki.patterns.creational.singleton;

public class Configuration {

    private static Configuration INSTANCE;

    private Configuration(){

    }

    public static Configuration getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Configuration();
        }
        return INSTANCE;
    }
}
