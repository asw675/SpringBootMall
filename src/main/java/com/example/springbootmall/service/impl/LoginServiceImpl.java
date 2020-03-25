package com.example.springbootmall.service.impl;


import com.example.springbootmall.common.JwtTokenUtil;
import com.example.springbootmall.dao.UmsMemberMapper;
import com.example.springbootmall.model.UmsLoginResult;
import com.example.springbootmall.model.UmsMember;
import com.example.springbootmall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

//    @Autowired
//    private UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public UmsLoginResult Login(String username, String password) {
        UmsMember umsMember = umsMemberMapper.selectByUsername(username);
        UmsLoginResult result = new UmsLoginResult();
        String token = jwtTokenUtil.generateToken(username);
        result.setToken(token);
        result.setUserInfo(umsMember);
        return result;
    }

    @Override
    public int Register(UmsMember umsMember) {
        return umsMemberMapper.insertSelective(umsMember);
    }
}
