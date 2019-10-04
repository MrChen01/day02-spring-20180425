package com.gyf.test;

import com.gyf.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson04 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");

         //从容器获取两个bean
        IUserService userService1 = (IUserService) context.getBean("userService");
        IUserService userService2 = (IUserService) context.getBean("userService");

        System.out.println(userService1);
        System.out.println(userService2);


    }
}
