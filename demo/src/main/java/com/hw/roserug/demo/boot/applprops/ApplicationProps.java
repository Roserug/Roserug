package com.hw.roserug.demo.boot.applprops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringBoot默认扫描加载启动类(main方法)同级包或子包的类,如果想改变包的扫描范围,
 * 即可使用@ComponentScan(basePackages={"包名1","包名2"});
 * 
 * @author Roserug
 */
@SpringBootApplication
public class ApplicationProps {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationProps.class, args);
		ConfigurableApplicationContextStyle.infoProps(context);
	}
}
