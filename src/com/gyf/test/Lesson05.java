package com.gyf.test;

import com.gyf.model.User;
import com.gyf.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson05 {

    @Test
    public void test1() throws Exception {

        //Bean的生命周期
        ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");

        User user = (User) context.getBean("user");

        System.out.println(user);


        //关闭容器
        context.getClass().getMethod("close").invoke(context);
    }
}
