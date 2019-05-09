package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        SampleBeanInterface bean1 = (SampleBeanInterface)app.getBean("bean1");
        System.out.println(bean1);
    }
}
