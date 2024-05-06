package com.hmdp.service.impl;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class QkyRobotServiceImpl implements RobotService {

    private static final String apiTpl = "http://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";
    private static  final Gson gson = new Gson();
    @Override
    public Response qa(String msg) {


        String api = null;
        try {
            api = String.format(apiTpl, URLEncoder.encode(msg,"UTF-8") );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String result =  HttpUtils.request(api);

        //可以做逻辑判断，比如null的时候，或者出错

        Response response = gson.fromJson(result,Response.class);

        return response;
    }
}
