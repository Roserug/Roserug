package com.hw.roserug.demo.boot.applicationprops.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 1.公共配置文件的优先级大于自定义文件的优先级,如果Spring容器中已包含该值,则直接取Spring容器中的值进行注入;
 * 2.@Configuration注解标注该类为配置类,与@Component(标注组件)类似;@Configuration注解的底层就
 * 是@Component,但是二者意义不同,@Configuration注解侧重配置之意,@Component侧重组件之意,当然配置也
 * 是项目组件之一,在这里我们要将配置文件属性与JavaBean绑定,当然更侧重配置之意;
 * 3.@PropertySource("classpath:xxx.properties")-指定自定义参数文件的注解;
 * 4.@ConfigurationProperties(prefix="key")-把properties文件转化为bean,然后可与@EnableConfigur
 * ationProperties(JavaBean.class)注解配合使用,该注解可使@ConfigurationProperties生效,并从IOC容器中
 * 获取bean;
 * 5.若去掉@ConfigurationProperties注解,则值不会注入;
 * 6.@Data 这个是一个lombok注解,用于生成getter&setter方法;
 * 
 * @author Roserug
 *
 */
@Configuration
@PropertySource("classpath:user.properties")
@ConfigurationProperties(prefix="user")
public class SpecifyUser {
	private String name;
	private int age;
	private String sex;
	private String school;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toJson() {
		return "name:" + name + ",age:" + age + ",sex:" + sex + ",school:" + school
				+ ",address:" + address;
	}
}
