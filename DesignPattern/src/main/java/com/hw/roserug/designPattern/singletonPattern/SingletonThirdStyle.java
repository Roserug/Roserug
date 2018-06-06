package com.hw.roserug.designPattern.singletonPattern;
/**
 * 单例模式:非懒加载、线程安全(基于类加载机制避免多线程问题);
 * 
 * 描述:该单例方法没有加锁,执行效率会提高,但是单例对象在类加载时就初始化,会浪费内存;它基于classloder机制避免了多线程的同步问题,
 * 不过,singleton在类装载时就实例化,虽然导致类装载的原因有很多种,在单例模式中大多数都是调用getInstance方法,但是也不能确定有
 * 其他的方式(或者其他的静态方法)导致类装载,这时候初始化 singleton显然没有达到 lazy loading(懒加载)的效果;
 * 
 * @author Roserug
 *
 */
public class SingletonThirdStyle {
	private static 	SingletonThirdStyle singleton = new SingletonThirdStyle();
	
	private SingletonThirdStyle(){}
	
	public static SingletonThirdStyle getInstance() {
		return singleton;
	}
}
