package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SampleBeanConfig {

	@Bean
    public SampleBeanInterface sampleBean() {
        return new SampleBean("設定クラスで作ったインスタンスです。");
    }
}
