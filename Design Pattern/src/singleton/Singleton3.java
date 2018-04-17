package singleton;

//双检锁式单例（Double Check Lock（DCL））
//volatile关键字，表示此操作是一个原子操作，不能中间被分割执行。
//使用volatile关键字会影响性能。

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
