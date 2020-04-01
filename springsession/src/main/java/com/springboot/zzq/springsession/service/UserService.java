package com.springboot.zzq.springsession.service;

import org.springframework.stereotype.Service;


import com.springboot.zzq.springsession.bean.User;
import com.springboot.zzq.springsession.mapper1.UserMapperOne;
import com.springboot.zzq.springsession.mapper2.UserMapperTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getAllOne();

    public  List<User> getAllTwo();


}
