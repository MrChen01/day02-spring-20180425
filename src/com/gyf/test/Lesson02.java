package com.gyf.test;

import com.gyf.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Lesson02 {

    @Test
    public void test1(){

/*      BeanFactory 采取延迟加载，第一次getBean时才会初始化Bean
        ApplicationContext 即时加载
        ApplicationContext是对BeanFactory扩展，提供了更多功能
            国际化处理
            事件传递
            Bean自动装配
            各种不同应用层的Context实现

        */

        // /Spring容器加载有3种方式
        //ClassPathXmlApplicationContext
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //IUserService user = (IUserService) context.getBean("userService");
        //user.add();

        //BeanFactory(了解)
        String path = "C:\\Users\\10301\\Desktop\\IDEAWorkspace\\day02-spring-20180425\\src\\beans.xml";
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(path));
        IUserService user = (IUserService) factory.getBean("userService");
        //user.add();




    }
}
