package com.gyf.test;

import com.gyf.model.Customer;
import com.gyf.model.Programmer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.dc.pr.PRError;

public class Lesson09 {

    @Test
    public void test1() throws Exception {


        /**
         * Bean的集合注入
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans9.xml");

        Programmer programmer  = (Programmer) context.getBean("programmer");

        System.out.println("车:" + programmer.getCars());
        System.out.println("宠物:" + programmer.getPats());
        System.out.println("个人信息:" + programmer.getInfos());
        System.out.println("数据库连接信息:" + programmer.getMysqlInfos());
        System.out.println("家庭成员:");
        for (String member: programmer.getMembers()){
            System.out.println(member);
        }
    }
}
