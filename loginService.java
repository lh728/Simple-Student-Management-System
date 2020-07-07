package com.example.service;

import com.example.entity.login;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


//接收由controller层传过来的数据，这一层的目标是继续传入数据到dao层，等待dao层从数据库拿到用户名和密码进行比较，判断在controller层进行
@Service
public class loginService {
    @Autowired
    private com.example.dao.loginDao loginDao;
    public  boolean Find(String name,int password){
        List<login> userList = loginDao.findByNameAndPassword(name,password);
        return userList.size()>0;
