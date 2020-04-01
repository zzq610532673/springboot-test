package com.springboot.zzq.springsession.mapper2;


import com.springboot.zzq.springsession.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapperTwo {
    List<User> getAllUser();
}
