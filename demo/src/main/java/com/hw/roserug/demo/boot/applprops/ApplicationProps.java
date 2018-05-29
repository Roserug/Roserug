package com.hw.roserug.demo.boot.applprops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hw.roserug.demo.boot.applprops.util.SpringUtil;

@SpringBootApplication
public class ApplicationProps {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationProps.class, args);
		ConfigurableApplicationContextStyle.infoProps(context);
		AutoBeanInjectStyle obj = (AutoBeanInjectStyle) SpringUtil.getBean("autoBeanInjectStyle");
		obj.info();
	}
}
