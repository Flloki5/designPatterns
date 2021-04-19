package com.flloki.patterns.creational.singleton;

public enum HOST {
    GOOGLE("google.com", "9008"),
    LOCALHOST("localhost", "8080");

    private String host;
    private String port;

    HOST(String host, String port){
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }
}
