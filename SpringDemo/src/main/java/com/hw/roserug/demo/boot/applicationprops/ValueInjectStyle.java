package com.hw.roserug.demo.boot.applicationprops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 通过@Value注解获取配置文件的值,即@Value("${people.name}");
 * 若直接用@Value("people.name"),则只是把字符串赋值给相应的变量;
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
