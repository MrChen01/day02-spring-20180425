package com.gyf.test;

import com.gyf.model.User;
import com.gyf.service.IUserService;
import com.gyf.web.action.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson11 {

    @Test
    public void test1() throws Exception {

       //注解的使用
        //web开发流程 action -> service -> dao

        ApplicationContext context = new ClassPathXmlApplicationContext("beans11.xml");
        //拿到service
        IUserService userService = (IUserService) context.getBean("userService");

        //添加用户
        User user = new User();
        user.setUsername("gyf");
        user.setPassword("1234");
        userService.add(user);
    }@Test
    public void test2() throws Exception {

       //注解的使用
        //web开发流程 action -> service -> dao

        ApplicationContext context = new ClassPathXmlApplicationContext("beans11.xml");

        //拿到action
        UserAction userAction = (UserAction) context.getBean("userAction");

        //添加用户
        User user = new User();
        user.setUsername("gyf");
        user.setPassword("1234");
        userAction.save(user);
    }
}
