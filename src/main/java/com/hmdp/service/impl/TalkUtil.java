package com.hmdp.service.impl;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class TalkUtil {

    //机器人对应的APIkey--图灵平台获取
    public static final String API_KEY = "d3a63c004e614549a26beaa7fb9c53f5";
    public static final String API_URL = "http://www.tuling123.com/openapi/api";

    /**
     * @param msg 需要发送的消息
     * @return
     */
    private String setParameter(String msg) {
        try {
            return API_URL + "?key=" + API_KEY + "&info=" + URLEncoder.encode(msg, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 拿到消息回复的内容
     * @param json 请求接口得到的JSON
     * @return text的部分
     */
    private String getString(String json){
        try {
            JSONObject object = new JSONObject(json);
            return object.getString("text");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 提供对外公开的方法用于最终拿到机器人回复的消息
     * @param msg 传入你需要发送的信息
     * @return 机器人对你的回复
     */
    public String getMessage(String msg) throws Exception {
        return getString(getHTML(setParameter(msg)));
    }


    private String getHTML(String url) throws Exception {
        StringBuffer buffer = new StringBuffer();
        BufferedReader bufferedReader = null;
        try {
            URL u = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) u.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                buffer.append(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) throws Exception {
        TalkUtil util = new TalkUtil();
        Scanner scanner = new Scanner(System.in);//控制台输入
        while (scanner.hasNext()){
            //直接输出机器人的回复
            System.err.println("Ta 对你说 ----> " + util.getMessage(scanner.nextLine()));
        }
    }

}