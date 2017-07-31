package com.zenhome.cloud2cloud.service.ys_adapter.ysutils;


import com.zenhome.cloud2cloud.service.ys_adapter.bean.YsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.TransMapUtil;
import utils.http.HttpClientUtil;
import utils.http.HttpRespObject;

import java.util.Map;

/**
 * Created by Gao on 2017/7/26.
 *
 */
public class YsHttpUtil {
    private static Logger logger = LoggerFactory.getLogger(YsHttpUtil.class);

    //accessToken获取
    public static String getToken(String appKey,String appSecret,YsBean ysHeader){
        String result="";
        Map<String,String> headers = TransMapUtil.transBeanMap(YsBean.class);
        headers.put("Content-Type","application/x-www-form-urlencoded");
//        JSONObject reqJson = new JSONObject();
//        reqJson.put("appKey",appKey);
//        reqJson.put("appSecret",appSecret);

        String url = "https://open.ys7.com/api/lapp/device/add?appKey="+appKey+"&appSecret="+appSecret;
        logger.info("萤石开发者获取accessToken");
        HttpRespObject httpRespObject = HttpClientUtil.sendPost(url,"",headers);
        if (!httpRespObject.isSuccess()){
            logger.info("访问失败"+httpRespObject.getStatusCode());
        }else{
            result = httpRespObject.getContent().toString();
        }
        return result;
    }

public static String DevBind (String accessToken,String deviceSerial,String validateCode){
    String result = "";
    Map<String,String> headers = TransMapUtil.transBeanMap(YsBean.class);
    headers.put("Content-Type","application/x-www-form-urlencoded");
    String url = "https://open.ys7.com/api/lapp/device/add?accessToken="+accessToken+"&deviceSerial="+deviceSerial+"&validateCode="+validateCode;
    logger.info("萤石设备绑定");
    HttpRespObject httpResObject = HttpClientUtil.sendPost(url,"",headers);
    if(!httpResObject.isSuccess()){
        logger.info("访问失败"+httpResObject.getStatusCode());
    }else{
        result = httpResObject.getContent().toString();
    }
    return result;
}
}
