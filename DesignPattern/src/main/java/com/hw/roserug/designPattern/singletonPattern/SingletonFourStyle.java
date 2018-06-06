package com.hw.roserug.designPattern.singletonPattern;

/**
 * 单例模式:懒加载、线程安全(双检锁/双重校验锁-DCL,即double-checked locking);
 * 
 * 描述:这种方式采用双锁机制,安全且在多线程情况下能保持高性能; getInstance()的性能对应用程序很关键时使用;
 * 
 * @author Roserug
 *
 */
public class SingletonFourStyle {
	private volatile static SingletonFourStyle singleton;
	
	private SingletonFourStyle(){}
	
	public static SingletonFourStyle getInstance() {
		if(singleton == null) {
			synchronized (SingletonFourStyle.class) {
				if(singleton == null) {
					singleton = new SingletonFourStyle();
				}
			}
		}
		
		return singleton;
	}
}
