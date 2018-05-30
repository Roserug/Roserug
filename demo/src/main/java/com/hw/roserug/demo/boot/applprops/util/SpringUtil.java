package com.hw.roserug.demo.boot.applprops.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/**
 * 应用场景:在web应用中,Spring容器通常采用声明式方式配置生成:即开发者只要在web.xml中配置一个Listener,该Listener将会负责
 * Spring容器的初始化,MVC框架可以直接调用Spring容器中的Bean,无需访问Spring容器本身.在这种情况下,容器的Bean处于容器管理下,
 * 无需主动访问容器,只需接受容器的依赖注入即可.
 * 但是,在某些特殊情况下,bean需要实现某个功能,但该功能必须借助于Spring容器才能实现,此时就必须让该Bean先获取Spring容器,然后借
 * 助于Spring容器实现该功能.为了让Bean获取它所在的Spring容器,可以让该Bean实现ApplicationContextAware接口.
 * 
 * 流程:Spring容器会检测容器中的所有Bean,如果发现某个Bean实现了ApplicationContextAware接口,Spring容器会在创建该
 * Bean之后,自动调用该Bean的setApplicationContext方法,调用该方法时,会将容器本身作为参数传给该方法;
 * 
 * 注:可以不使用注解的方式,但是要主动调用setApplicationContext方法设置Spring容器;
 * 
 * @author Roserug
 *  
 */
@Component
public class SpringUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext = null;
	/* SpringBoot默认扫描;
	 * 
	 * 非@import显式注入,@Component是必须的,且该类必须与main同包或子包; 
	 * 若非同包或子包，则需手动import注入;
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if (SpringUtil.applicationContext == null) {
			SpringUtil.applicationContext = applicationContext;
		}
	}

	// 获取applicationContext
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	// 通过name获取 Bean.
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);

	}

	// 通过class获取Bean.
	public static <T> T getBean(Class<T> clazz) {
		return getApplicationContext().getBean(clazz);
	}

	// 通过name,以及Clazz返回指定的Bean
	public static <T> T getBean(String name, Class<T> clazz) {
		return getApplicationContext().getBean(name, clazz);
	}
}

