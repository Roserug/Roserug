package com.hw.roserug.designPattern.singletonPattern;

/**
 * 单例模式(枚举):非懒加载、线程安全;
 * 
 * 描述:这种实现方式还没有被广泛采用,但这是实现单例模式的最佳方法.它更简洁,自动支持序列化机制,绝对防止多次实例化;
 * 
 * @author Roserug
 *
 */
public enum SingletonSixStyle {
	SINGLETON;
	
	private Singleton singleton;
	
	SingletonSixStyle() {
		singleton = new Singleton();
	}
	
	public Singleton getInstance() {
		return singleton;
	}
}

class Singleton {
	
}
