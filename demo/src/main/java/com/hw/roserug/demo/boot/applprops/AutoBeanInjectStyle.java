package com.hw.roserug.demo.boot.applprops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AutoBeanInjectStyle {
	@Autowired
	private Environment env;
	
	public void info(){
		System.out.println(env.getProperty("people.name"));
	}
}
