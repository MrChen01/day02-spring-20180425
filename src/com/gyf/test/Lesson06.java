package com.gyf.test;

import com.gyf.model.Student;
import com.gyf.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson06 {

    @Test
    public void test1() throws Exception {
        //给对象的属性赋值方式讲解 【】
        /**
         * 1.构造方法注入
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");

        Student stu  = (Student) context.getBean("stu");


        System.out.println(stu);
    }
}
