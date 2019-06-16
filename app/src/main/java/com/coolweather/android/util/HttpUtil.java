package com.coolweather.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String addrerss, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(addrerss).build();
        client.newCall(request).enqueue(callback);
    }
}
