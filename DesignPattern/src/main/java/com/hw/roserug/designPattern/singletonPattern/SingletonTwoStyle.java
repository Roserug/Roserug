package com.hw.roserug.designPattern.singletonPattern;

/**
 * 单例模式:懒加载、线程安全(在方法级通过synchronized关键字实现并发控制,每次获取实例
 * 都存在并发控制,效率低,getInstance()的性能对应用程序性能影响很小时使用;);
 * 
 * @author Roserug
 *
 */
public class SingletonTwoStyle {
	private static 	SingletonTwoStyle singleton;
	
	private SingletonTwoStyle(){}
	
	public static synchronized SingletonTwoStyle getInstance() {
		if(singleton == null){
			singleton = new SingletonTwoStyle();
		}
		return singleton;
	}
}
