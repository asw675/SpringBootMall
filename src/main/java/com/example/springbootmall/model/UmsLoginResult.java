package com.example.springbootmall.model;

public class UmsLoginResult {
    private UmsMember userInfo;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UmsMember getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UmsMember userInfo) {
        this.userInfo = userInfo;
    }
}
