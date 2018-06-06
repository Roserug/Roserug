package com.hw.roserug.designPattern.singletonPattern;

/**
 * 一般情况下,不建议使用第 1种和第 2种懒汉方式,建议使用第 3种饿汉方式.只有在要明确实现lazy loading效果时,才会使用第 5种登记方式.
 * 如果涉及到反序列化创建对象时,可以尝试使用第 6种枚举方式.如果有其他特殊的需求,可以考虑使用第 4种双检锁方式;
 * 
 * @author Roserug
 *
 */
public class SingletonClient {
	public static void main(String[] args) {
		//获取单例对象
		SingletonThirdStyle.getInstance();
	}
}
