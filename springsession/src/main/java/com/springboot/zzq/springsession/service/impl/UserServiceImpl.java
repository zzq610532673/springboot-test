package com.springboot.zzq.springsession.service.impl;

import com.springboot.zzq.springsession.bean.User;
import com.springboot.zzq.springsession.mapper1.UserMapperOne;
import com.springboot.zzq.springsession.mapper2.UserMapperTwo;
import com.springboot.zzq.springsession.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapperOne userMapperOne;
    @Resource
    private UserMapperTwo userMapperTwo;

    @Override
    public List<User> getAllOne() {
        List<User> users = userMapperOne.getAllUser();
        return users;
    }

    @Override
    public List<User> getAllTwo() {
        List<User> users2 = userMapperTwo.getAllUser();
        return users2;
    }
}
