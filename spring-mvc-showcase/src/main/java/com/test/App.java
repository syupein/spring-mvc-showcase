package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.aop.SampleAopBean;
import com.test.aop.SampleAopConfig;

public class App {
	public static void main(String[] args) {
		App test = new App();
		test.testAopClass();
//		test.testAopXml();
//		test.testComponent();
    }

	private void testAopClass() {
		// xmlとの違いはクラス宣言するぐらい？
		// Componentとほぼ同じに使える
        ApplicationContext app = new AnnotationConfigApplicationContext(SampleAopConfig.class);

        SampleAopBean bean1 = (SampleAopBean) app.getBean("sampleAopBean");
        bean1.printMessage();
 
        System.out.println("--------------------");
 
        SampleAopBean bean2 = (SampleAopBean) app.getBean("proxyFactoryBean");
        bean2.printMessage();
	}
	
	private void testAopXml() {
		//
        ApplicationContext app = new ClassPathXmlApplicationContext("aopbean.xml");
         
        SampleAopBean bean1 = (SampleAopBean) app.getBean("sampleAopBean");
        bean1.printMessage();
 
        System.out.println("--------------------");
 
        SampleAopBean bean2 = (SampleAopBean) app.getBean("proxyFactoryBean");
        bean2.printMessage();
	}
	
	private void testComponent() {
        ApplicationContext app = new AnnotationConfigApplicationContext(SampleBeanConfig.class);
        SampleBeanInterface bean1 = app.getBean(SampleBeanInterface.class);
        System.out.println(bean1);
        
        BeanHolder holder = app.getBean(BeanHolder.class);
        holder.showMessage();
		
	}
}
