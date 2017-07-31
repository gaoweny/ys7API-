package com.zenhome.cloud2cloud.service.ys_adapter.bean;

/**
 * Created by Gao on 2017/7/26.
 */
public class YsBean {
    private String appKey;//萤石会员开发者appkey
    private String appSecret;//萤石会员开发者密码
    private String accessToken;//token
    private String deviceSerial;//设备号
    private String validateCode;//设备机身验证码

    public String getAppKey(){
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret(){
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAccessToken(){
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }
}
