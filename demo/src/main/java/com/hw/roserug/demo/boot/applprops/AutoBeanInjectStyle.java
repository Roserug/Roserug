package com.hw.roserug.demo.boot.applprops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
/**
 * 把Environment实例直接注入到类中;
 * 
 * @author Roserug
 *
 */
@Component
public class AutoBeanInjectStyle {
	@Autowired
	private Environment env;
	
	public String info(){
		return env.getProperty("people.name");
	}
}
