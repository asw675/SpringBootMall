package com.example.springbootmall.service;

import com.example.springbootmall.model.UmsLoginResult;
import com.example.springbootmall.model.UmsMember;

public interface LoginService {

    UmsLoginResult Login(String username,String password);

    int Register(UmsMember umsMember);
}
