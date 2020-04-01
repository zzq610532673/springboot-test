package com.springboot.zzq.springsession.mapper1;


import com.springboot.zzq.springsession.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapperOne {
    List<User> getAllUser();
}
