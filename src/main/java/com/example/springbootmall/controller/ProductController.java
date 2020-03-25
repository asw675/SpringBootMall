package com.example.springbootmall.controller;

import com.example.springbootmall.common.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(value = "/asd",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> test(){
        return CommonResult.success("asdqwe");
    }
}
