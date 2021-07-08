package com.example.mynews3;

import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OnlineNews extends AppCompatActivity {

    private static final int NEWS_NUMBER = 20;
    List<News> onlineNs;

    OnlineNews(){
        onlineNs = new ArrayList<>();

    }

    public void updataNews (String link){

        try{
            Log.d("ccccccc","get link");
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(link).build();
            Response response = client.newCall(request).execute();
            String responseData = response.body().string();
            parseXMLWithPull(responseData);

            //showResonses(request,client);
                    /*runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });*/

                    /*Response response = client.newCall(request).execute();
                    String responseData = response.body().string();*/
            //showResponse(responseData);
            Log.d("bbbbbbbbb","get link");

            //runOnUiThread

            //parseXMLWithPull(responseData);
            //showResonses(responseData);
        }catch (Exception e){
            e.printStackTrace();
        }


       /* new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Log.d("ccccccc","get link");
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder().url(link).build();
                    showResonses(request,client);
                    *//*runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });*//*

                    *//*Response response = client.newCall(request).execute();
                    String responseData = response.body().string();*//*
                    //showResponse(responseData);
                    Log.d("bbbbbbbbb","get link");

                    //runOnUiThread

                    //parseXMLWithPull(responseData);
                    //showResonses(responseData);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }).start();*/

    }

    private void showResonses(Request request,OkHttpClient client) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Response response = null;
                String responseData = null;
                try {
                    response = client.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    responseData = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                parseXMLWithPull(responseData);
            }
        });


    }

    private void parseXMLWithPull(String xmlData){
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xmlPullParser = factory.newPullParser();
            xmlPullParser.setInput(new StringReader(xmlData));
            int eventType = xmlPullParser.getEventType();
          /*  String id = "";
            String name = "";
            String version = "";*/
            String title = "";
            String description = "";
            String link = "";
            while (eventType != XmlPullParser.END_DOCUMENT && onlineNs.size() <= NEWS_NUMBER){
                String nodeName = xmlPullParser.getName();
                switch (eventType){
                    case XmlPullParser.START_TAG:{
                        if ("title".equals(nodeName)){
                            title = xmlPullParser.nextText();
                        }
                        else if("description".equals(nodeName)){
                            description = xmlPullParser.nextText();
                        }
                        else if("link".equals((nodeName))){
                            link = xmlPullParser.nextText();
                        }
                        break;
                    }

                    case XmlPullParser.END_TAG: {
                        if ("item".equals(nodeName)){
                          /*  Log.d("MainActivity","title is " + title);
                            Log.d("MainActivity", "description is " + description);
                            Log.d("MainActivity", "link is " + link);*/
                            News news = new News();
                            news.setTitle(title);
                            news.setContent(description);
                            news.setLink(link);
                            onlineNs.add(news);
                        }
                        break;
                    }

                    default:
                        break;
                }
                eventType = xmlPullParser.next();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
