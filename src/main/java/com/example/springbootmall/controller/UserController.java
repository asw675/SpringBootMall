package com.example.springbootmall.controller;

import com.example.springbootmall.common.CommonResult;
import com.example.springbootmall.common.RedisUtil;
import com.example.springbootmall.model.UmsLoginResult;
import com.example.springbootmall.model.UmsMember;
import com.example.springbootmall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    LoginService loginService;

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<UmsLoginResult> Login(String username, String password) {
        UmsLoginResult umsLoginResult = loginService.Login(username, password);
        if (password.equals(umsLoginResult.getUserInfo().getPassword())) {
            redisUtil.set(username+"_token",umsLoginResult.getToken());
            return CommonResult.success(umsLoginResult);
        } else {
            return CommonResult.failed("密码错误");
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> Register(UmsMember umsMember){
        int count = loginService.Register(umsMember);
        if (count > 0){
            return CommonResult.success(1);
        }else {
            return CommonResult.failed("该用户已存在");
        }
    }

}
