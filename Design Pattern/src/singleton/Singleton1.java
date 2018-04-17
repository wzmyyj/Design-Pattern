package singleton;

public class Singleton1 {
	// 单例对象
	private final static Singleton1 INSTANCE = new Singleton1();

	// 或
	// private final static Singleton INSTANCE;
	// static {
	// INSTANCE = new Singleton();
	// }

	// 私有构造方法
	private Singleton1() {
	}

	// 公有静态方法用于获取单例对象
	public static Singleton1 getInstance() {
		return INSTANCE;
	}
}
