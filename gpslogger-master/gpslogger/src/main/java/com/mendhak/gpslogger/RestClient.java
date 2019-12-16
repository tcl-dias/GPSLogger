package com.mendhak.gpslogger;

import okhttp3.OkHttpClient;

public class RestClient {

    private final String host;
    private final OkHttpClient client;
    public RestClient(String host, OkHttpClient client) {
        super();
        this.host = host;
        this.client = client;
    }
}
