package com.gyf.test;

import com.gyf.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Lesson01 {

    @Test
    public void test1(){
       //Spring容器加载有3种方式
        //第一种:ClassPathXmlApplicationContext ClassPath类路径加载，指的就是classes路径
        //第一种：最常用,spring的配置文件路径以后就直接放在src
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //第二种方式：文件系统路径获得配置文件【绝对路径】
        //ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\10301\\Desktop\\IDEAWorkspace\\day02-spring-20180425\\src\\com\\gyf\\beans.xml");

        //第三种方式:使用BeanFactory(了解)
        //String path = "C:\\Users\\10301\\Desktop\\IDEAWorkspace\\day02-spring-20180425\\src\\com\\gyf\\beans.xml";
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource(path));
        //IUserService user = (IUserService) factory.getBean("userService");
        //user.add();

        IUserService user = (IUserService) context.getBean("userService");
        user.add();


    }
}
