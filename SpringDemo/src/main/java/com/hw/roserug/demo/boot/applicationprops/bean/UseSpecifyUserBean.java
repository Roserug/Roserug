package com.hw.roserug.demo.boot.applicationprops.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 详情请见SpecifyUser类;
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
