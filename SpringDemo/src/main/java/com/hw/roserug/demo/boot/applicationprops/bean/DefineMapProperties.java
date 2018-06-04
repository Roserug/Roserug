package com.hw.roserug.demo.boot.applicationprops.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 把参数配置文件映射为Map,可根据key值获取对应的值;
 * 
 * ConfigurationProperties注解,有一个locations属性已过时,在spring boot1.5版本后
 * 被@PropertySource注解替代;
 * 
 * @author Roserug
 *
 */
@Configuration
@PropertySource("classpath:define.properties")
@ConfigurationProperties(prefix="define")
public class DefineMapProperties {
	private static Map<String, String> map = new HashMap<String, String>();
	
	public static String getValue(String key){
		return map.get(key);
	}
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		DefineMapProperties.map = map;
	}
}
