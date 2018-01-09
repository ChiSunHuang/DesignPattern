package singleton;
/**
 * 
 * @author chisunhuang
 * @data 2017-12-27 19:32
 */

import java.lang.reflect.Constructor;

public class Singleton {
	/**********懒汉模式************/
	/**
	 *  1.最简单的实现方式，但是线程不安全，可能会有多个对象
	 */
//	public static Singleton instance = null;
//	private Singleton() {}
//	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	/**
	 *  2.getInstance 加同步 synchronized 虽然是线程安全的 但是每次getInstance都要进行同步，太耗费性能。
	 */
//	public static Singleton instance = null;
//	private Singleton() {}
//	public synchronized static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	/**
	 *  3.避免synchronized范围过大，采用双重检测模式。但是要注意Singleton要加volatile防止一个线程new Singleton()时候指令重排序，另外一个线程得到
	 *  未初始化的对象。在2中不存在这个问题是因为同步的范围够大，另一个线程进入不到方法内部。
	 */
//	public static volatile Singleton instance = null;
//	private Singleton() {}
//	public synchronized static Singleton getInstance() {
//		if(instance == null) {
//			synchronized(Singleton.class) {
//				if(instance == null)
//					instance = new Singleton(); //这里存在指令重排序的问题
//			}
//		}
//		return instance;
//	}
	/**
	 *  4. 使用内部静态类来实现,classloader加载机制保证了线程安全,只有在调用getInstance的时候也就是LazyHolder.instance被调用的时候
	 *  LazyHolder类才会被classloader加载进内存，才会进行静态变量的初始化(new Singleton()),之后其他的线程才可以访问。
	 */
//	private Singleton() {} 
//	private static class LazyHolder {
//		private static Singleton instance = new Singleton();
//	}
//	public static Singleton getInstance() {
//		return LazyHolder.instance;
//	}
	/***********饿汉模式***********/  
	/**
	 * 如果Singleton比较占用资源又可能用不到，饿汉模式就会导致资源的浪费，懒汉模式可以在需要的时候再new一个实例对象
	 */
	/**
	 * 1.普通实现
	 */
//	private Singleton() {} 
//	private static Singleton instance = new Singleton();
//	public static Singleton getInstance() {
//		return instance;
//	}
	/*************************************************************************************************************/
	//以上不管哪种模式都架不住反射的破坏，利用反射可以直接打破以上的单例模式。这个时候只能用枚举类实现单例模式。
	
	//利用反射打破单例模式的代码,在测试类中运行
	//获得构造器
//	Constructor con = Singleton.class.getDeclaredConstructor();
//	//设置为可访问
//	con.setAccessible(true);
//	//构造两个不同的对象
//	Singleton singleton1 = (Singleton)con.newInstance();
//	Singleton singleton2 = (Singleton)con.newInstance();
//	//验证是否是不同对象
//	System.out.println(singleton1.equals(singleton2));
//	
	/**************************************************************************************************************/
	/**
	 *  2.枚举实现单例(属于饿汉模式，在枚举类加载的时候就会new一个实例对象)
	 */
//	public enum SingletonEnum {
//		INSTANCE;
//	}
}
