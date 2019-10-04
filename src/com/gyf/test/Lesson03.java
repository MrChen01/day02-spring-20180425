package com.gyf.test;

import com.gyf.service.IUserService;
import com.gyf.service.UserSereviceFactory1;
import com.gyf.service.UserSereviceFactory2;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Lesson03 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");

        //new 对象
        //IUserService userService1 = (IUserService) context.getBean("userService1");
        //userService1.add();


        //静态工厂
        //IUserService userService2 = UserSereviceFactory1.createUserService();
        //IUserService userService2 = (IUserService) context.getBean("userService2");
        //userService2.add();


        //实例工厂
        //1.创建工厂
       // UserSereviceFactory2 factory2 = new UserSereviceFactory2();
        //IUserService userService3 = factory2.createUserService();

        IUserService userService3 = (IUserService) context.getBean("userService3");
        userService3.add();
    }
}
