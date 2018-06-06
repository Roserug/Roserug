package com.hw.roserug.designPattern.singletonPattern;

/**
 * 单例模式(登记式/静态内部类):懒加载、线程安全;
 * 
 * 描述:这种方式能达到双检锁方式一样的功效,但实现更简单;对静态域使用延迟初始化,应使用这种方式而不是双检锁方式;
 * 这种方式只适用于静态域的,双检锁方式可在实例域需要延迟初始化时使用;
 * 这种方式同样利用了classloder机制来保证初始化singleton时只有一个线程,它跟第3种方式不同的是:第3种方式只要单例类
 * 被装载了,那么 instance就会被实例化(没有达到 lazy loading 效果),而这种方式是单例类被装载了,singleton不一定被初始化,
 * 因为 SingletonHolder类没有被主动使用,只有通过显式调用getInstance方法时,才会显式装载 SingletonHolder类,从而实例
 * 化 singleton.想象一下,如果实例化singleton很消耗资源,所以想让它延迟加载,另外一方面,又不希望在 单例类加载时就实例化,因为不能
 * 确保单例类还可能在其他的地方被主动使用从而被加载,那么这个时候实例化singleton显然是不合适的;这个时候,这种方式相比第3种方式就
 * 更加合理;
 * 
 * @author Roserug
 *
 */
public class SingletonFiveStyle {
	private static class SingetonHolder {
		private static final SingletonFiveStyle singleton = 
				new SingletonFiveStyle();
	}
	
	private SingletonFiveStyle(){}
	
	public static final SingletonFiveStyle getInstance() {
		return SingetonHolder.singleton;
	}
}
