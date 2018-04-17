package singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonManager {
	// 容器
	private static Map<String, Object> objMap = new HashMap<String, Object>();

	// 私有构造方法
	private SingletonManager() {
	}

	// 注册单例
	public static void ascendSingleton(String key, Object instance) {
		if (!objMap.containsKey(key)) {
			objMap.put(key, instance);
		}
	}

	// 获得单例对象
	public static Object getInstance(String key) {
		return objMap.get(key);
	}
}