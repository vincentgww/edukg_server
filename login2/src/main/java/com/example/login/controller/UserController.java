package com.example.login.controller;

import com.example.login.dao.UserDao;
import com.example.login.entity.User;
//import com.example.login.form.LoginBack;
import com.example.login.form.LoginForm;
import com.example.login.vo.BaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class UserController {
	//@Autowired
    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @ResponseBody
    @PostMapping("/login")
    public BaseVo<User> login(@RequestBody LoginForm loginForm){
        BaseVo<User> result = new BaseVo<>();
        User u = userDao.findByInf(loginForm.getAccount(), loginForm.getPassword());
        if (u != null) {
            result.setCode(0);
            result.setData(u);
        } else {
            result.setMessage("账号不存在或用户名密码错误");
            result.setCode(1002);
        }
        return result;
    }

    @ResponseBody
    @PostMapping("/register")
    public BaseVo<String> add(@RequestBody User user) {
        BaseVo<String> result = new BaseVo<>();
        
        if (userDao.findByAccount(user.getAccount()) == null) {
            userDao.addUser(user);
            result.setMessage("注册成功");
            result.setCode(0);

        } else {
            result.setMessage("已存在该用户，请重新注册");
            result.setCode(1001);
        }
        return result;
    }

}