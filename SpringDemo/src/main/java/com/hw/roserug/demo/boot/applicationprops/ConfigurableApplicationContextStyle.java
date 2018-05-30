package com.hw.roserug.demo.boot.applicationprops;

import org.springframework.context.ConfigurableApplicationContext;

public class ConfigurableApplicationContextStyle {
	/**
	 * 通过ConfigurableApplicationContext获取公共配置文件参数;
	 * 
	 * 1.通过SpringApplication.run获取ConfigurableApplicationContext对象;
	 * 2.获取ConfigEnvironment对象;
	 * 3.通过getProperty方法获取参数值;
	 * @param context
	 * 
	 */
	public static void infoProps(ConfigurableApplicationContext context) {
		System.out.println(context.getEnvironment().getProperty("people.name"));
	}
}
