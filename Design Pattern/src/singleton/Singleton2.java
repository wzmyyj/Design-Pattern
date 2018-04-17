package singleton;

//懒汉式单例
//在第一次调用getInstance()时，创建单例对象。
//synchronized关键字修饰，使getInstance()是一个同步方法。
//保证多线程情况下单例对象的唯一。但是，同步会耗费资源。

public class Singleton2 {
	// 单例对象
	private static Singleton2 INSTANCE = null;

	// 私有构造方法
	private Singleton2() {
	}

	// synchronized关键字修饰静态方法
	public static synchronized Singleton2 getInstance() {
		if (null == INSTANCE) {// 空值判断
			INSTANCE = new Singleton2();
		}
		return INSTANCE;
	}
}