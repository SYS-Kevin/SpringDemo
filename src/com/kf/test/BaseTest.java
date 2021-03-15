package com.kf.test;

import com.kf.controller.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        Computer computer = (Computer) context.getBean("computer");
        computer.output();
    }
}
