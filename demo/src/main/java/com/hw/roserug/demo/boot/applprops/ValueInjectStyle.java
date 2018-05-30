package com.hw.roserug.demo.boot.applprops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 通过@Value注解获取配置文件的值;
 * 
 * 注:可以使用@PropertySource("classpath:xxx.properties")指定指定的参数文件;
 * 
 * @author Administrator
 *
 */
@Component
public class ValueInjectStyle {
	@Value("${people.name}")
	private String name;
	@Value("${people.age}")
	private int age;
	@Value("${people.sex}")
	private String sex;
	
	public String toJson(){
		return "name:" + name + ",age:" + age + ",sex:" + sex;
	}
}
