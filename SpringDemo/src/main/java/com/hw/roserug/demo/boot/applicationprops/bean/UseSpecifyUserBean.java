package com.hw.roserug.demo.boot.applicationprops.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 详情请见SpecifyUser类;
 * 
 * EnableConfigurationProperties注解,激活自定义配置配置类,但在spring boot1.5之后可以通过@Componemt注解
 * 直接注入Bean.
 * 
 * @author Roserug
 *
 */
@Component
@EnableConfigurationProperties(SpecifyUser.class)
public class UseSpecifyUserBean {
	@Autowired
	SpecifyUser specifyUser;
	
	public String toJson(){
		return specifyUser.toJson();
	}
}
