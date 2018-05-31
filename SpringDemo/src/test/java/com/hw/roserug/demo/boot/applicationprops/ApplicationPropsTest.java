package com.hw.roserug.demo.boot.applicationprops;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hw.roserug.demo.boot.applicationprops.AutoBeanInjectStyle;
import com.hw.roserug.demo.boot.applicationprops.ValueInjectStyle;
import com.hw.roserug.demo.boot.applicationprops.bean.SpecifyUser;
import com.hw.roserug.demo.boot.applicationprops.bean.User;

/**
 * SpringBoot使用Junit测试若想通过@Autowired和@Resource注入Bean,则需要在测试类类名上加
 * 入@RunWith(SpringJUnit4ClassRunner.class)及@SpringBootTest注解;
 * 
 * 注:测试的包路径和src下的包路径要保持一致;
 * 
 * @author Roserug
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationPropsTest {
	@Autowired
	AutoBeanInjectStyle autoBeanInjectStyle;//使用Environment对象注入
	@Autowired
	ValueInjectStyle valueInjectStyle;//使用value注解
	@Autowired
	User user;
	@Autowired
	SpecifyUser specifyUser;
	
	@Test
	public void testAutoBeanInjectStyle() {
		Assert.assertEquals("one", autoBeanInjectStyle.info());
		System.err.println(autoBeanInjectStyle.info());
	}
	
	@Test
	public void testValueInjectStyle() {
		System.err.println(valueInjectStyle.toJson());
	}
	
	@Test
	public void testBeanUser(){
		System.err.println(user.toJson());
	}
	
	@Test
	public void testBeanSpecifyUser(){
		System.err.println(specifyUser.toJson());
	}
}
