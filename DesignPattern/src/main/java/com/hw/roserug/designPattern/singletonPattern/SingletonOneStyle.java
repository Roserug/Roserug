package com.hw.roserug.designPattern.singletonPattern;

/**
 * 单例模式:懒加载、非线程安全模式;
 * 
 * 描述:这种方式是最基本的实现方式,这种实现最大的问题就是不支持多线程.因为没有加锁 synchronized,所以严格意义上它并不算单例模式.
 * 
 * @author Roserug
 *
 */
public class SingletonOneStyle {
	private static 	SingletonOneStyle singleton;
	
	private SingletonOneStyle(){}
	
	public static SingletonOneStyle getInstance() {
		if(singleton == null){
			singleton = new SingletonOneStyle();
		}
		return singleton;
	}
}
