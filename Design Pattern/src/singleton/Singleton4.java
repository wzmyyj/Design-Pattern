package singleton;

//静态内部类单例
//第一次加载Singleton时，SingletonHolder不会被加载。
//只用调用getInstance()时，才加载SingletonHolder，并创建INSTANCE。
//推荐大家使用。

public class Singleton4 {
	// 内部类，包含单例的对象
	private static class SingletonHolder {
		public static final Singleton4 INSTANCE = new Singleton4();
	}

	// 私有构造方法
	private Singleton4() {
	}

	// 公有静态方法用于获取单例对象
	public static final Singleton4 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
