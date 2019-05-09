package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SampleBeanConfig.class);
        SampleBeanInterface bean1 = (SampleBeanInterface)app.getBean(SampleBeanInterface.class);
        System.out.println(bean1);
    }
}
