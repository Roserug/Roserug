package com.hw.roserug.demo.boot.applprops;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * SpringBoot使用Junit测试若想通过@Autowired和@Resource注入Bean,则需要在测试类类名上加
 * 入@RunWith(SpringJUnit4ClassRunner.class)及@SpringBootTest注解;
 * 
 * @author Roserug
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationPropsTest {
	@Autowired
	AutoBeanInjectStyle autoBeanInjectStyle;
	@Autowired
	ValueInjectStyle valueInjectStyle;
	
	@Test
	public void testAutoBeanInjectStyle() {
		Assert.assertEquals("one", autoBeanInjectStyle.info());
		System.err.println(autoBeanInjectStyle.info());
	}
	
	@Test
	public void testValueInjectStyle() {
		System.err.println(valueInjectStyle.toJson());
	}
}
