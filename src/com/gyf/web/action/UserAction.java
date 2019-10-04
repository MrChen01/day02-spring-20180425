package com.gyf.web.action;

import com.gyf.model.User;
import com.gyf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction{

    @Autowired//spring自动注入userService赋值
    @Qualifier("myUserService")//根据指定的id注入属性
    private IUserService userService;

    public void save(User user){
        System.out.println("action save方法 ");
        userService.add(user);
    }
}
