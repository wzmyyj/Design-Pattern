package singleton;

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