package com.gyf.test;

import com.gyf.model.Customer;
import com.gyf.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson08 {

    @Test
    public void test1() throws Exception {


        /**
         * SpEL:spring表达式
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans8.xml");

        Customer customer  = (Customer) context.getBean("customer");
        System.out.println(customer);

        System.out.println(customer.getAddress());
    }
}
