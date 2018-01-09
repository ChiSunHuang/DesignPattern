package singleton;
/**
 * 
 * @author chisunhuang
 * @data 2017-12-27 19:32
 */

import java.lang.reflect.Constructor;

public class Singleton {
	/**********����ģʽ************/
	/**
	 *  1.��򵥵�ʵ�ַ�ʽ�������̲߳���ȫ�����ܻ��ж������
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
	 *  2.getInstance ��ͬ�� synchronized ��Ȼ���̰߳�ȫ�� ����ÿ��getInstance��Ҫ����ͬ����̫�ķ����ܡ�
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
	 *  3.����synchronized��Χ���󣬲���˫�ؼ��ģʽ������Ҫע��SingletonҪ��volatile��ֹһ���߳�new Singleton()ʱ��ָ������������һ���̵߳õ�
	 *  δ��ʼ���Ķ�����2�в����������������Ϊͬ���ķ�Χ������һ���߳̽��벻�������ڲ���
	 */
//	public static volatile Singleton instance = null;
//	private Singleton() {}
//	public synchronized static Singleton getInstance() {
//		if(instance == null) {
//			synchronized(Singleton.class) {
//				if(instance == null)
//					instance = new Singleton(); //�������ָ�������������
//			}
//		}
//		return instance;
//	}
	/**
	 *  4. ʹ���ڲ���̬����ʵ��,classloader���ػ��Ʊ�֤���̰߳�ȫ,ֻ���ڵ���getInstance��ʱ��Ҳ����LazyHolder.instance�����õ�ʱ��
	 *  LazyHolder��Żᱻclassloader���ؽ��ڴ棬�Ż���о�̬�����ĳ�ʼ��(new Singleton()),֮���������̲߳ſ��Է��ʡ�
	 */
//	private Singleton() {} 
//	private static class LazyHolder {
//		private static Singleton instance = new Singleton();
//	}
//	public static Singleton getInstance() {
//		return LazyHolder.instance;
//	}
	/***********����ģʽ***********/  
	/**
	 * ���Singleton�Ƚ�ռ����Դ�ֿ����ò���������ģʽ�ͻᵼ����Դ���˷ѣ�����ģʽ��������Ҫ��ʱ����newһ��ʵ������
	 */
	/**
	 * 1.��ͨʵ��
	 */
//	private Singleton() {} 
//	private static Singleton instance = new Singleton();
//	public static Singleton getInstance() {
//		return instance;
//	}
	/*************************************************************************************************************/
	//���ϲ�������ģʽ���ܲ�ס������ƻ������÷������ֱ�Ӵ������ϵĵ���ģʽ�����ʱ��ֻ����ö����ʵ�ֵ���ģʽ��
	
	//���÷�����Ƶ���ģʽ�Ĵ���,�ڲ�����������
	//��ù�����
//	Constructor con = Singleton.class.getDeclaredConstructor();
//	//����Ϊ�ɷ���
//	con.setAccessible(true);
//	//����������ͬ�Ķ���
//	Singleton singleton1 = (Singleton)con.newInstance();
//	Singleton singleton2 = (Singleton)con.newInstance();
//	//��֤�Ƿ��ǲ�ͬ����
//	System.out.println(singleton1.equals(singleton2));
//	
	/**************************************************************************************************************/
	/**
	 *  2.ö��ʵ�ֵ���(���ڶ���ģʽ����ö������ص�ʱ��ͻ�newһ��ʵ������)
	 */
//	public enum SingletonEnum {
//		INSTANCE;
//	}
}
