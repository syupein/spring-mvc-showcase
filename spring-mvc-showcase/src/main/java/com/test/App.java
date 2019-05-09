package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SampleBeanConfig.class);
        SampleBeanInterface bean1 = app.getBean(SampleBeanInterface.class);
        System.out.println(bean1);
        

        BeanHolder holder = app.getBean(BeanHolder.class);
        holder.showMessage();
    }
}
