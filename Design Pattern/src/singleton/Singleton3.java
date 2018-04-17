package singleton;

public class Singleton3 {
	// 单例对象，volatile关键字保证INSTANCE的原子性
	private volatile static Singleton3 INSTANCE = null;

	// 私有构造方法
	private Singleton3() {
	}

	// 两次空值检查，synchronized关键字同步
	public static Singleton3 getInstance() {
		if (null == INSTANCE) {
			synchronized (Singleton3.class) {
				if (null == INSTANCE) {
					INSTANCE = new Singleton3();
				}
			}
		}
		return INSTANCE;
	}
}
