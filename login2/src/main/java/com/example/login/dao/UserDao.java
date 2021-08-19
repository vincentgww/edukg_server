package com.example.login.dao;

import com.example.login.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao {
    User findById(long id);
    User findByAccount(String account);
    User findByInf(String account,String password);
    Long addUser(User user);

}