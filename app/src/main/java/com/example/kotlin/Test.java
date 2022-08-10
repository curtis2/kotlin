package com.example.kotlin;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Test {

    public static void main(String[] args) {
        System.out.println("test");
//        OkHttpSysGet();


    }

    private static Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    public void OkHttpGet() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("")
                .build();

         Response response = client.newCall(request).execute();
           response.body().string();
     }

     public static void OkHttpSysGet(){
       String url="Http//wwww.baidu.com";
       OkHttpClient client=new OkHttpClient();
       final Request request=new Request.Builder()
               .url(url)
               .build();

       Call call=client.newCall(request);
         call.enqueue(new Callback() {
             @Override
             public void onFailure(Call call, IOException e) {

             }

             @Override
             public void onResponse(Call call, Response response) throws IOException {
                 System.out.println(response.body().toString());
             }
         });
     }



}


