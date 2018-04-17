package singleton;

import java.util.HashMap;
import java.util.Map;

//����������
//ͨ��ע�ᣬ���Թ���������͵ĵ�����ʹ��ͳһ�ӿڣ����ؾ���ʵ�֡�

public class SingletonManager {
	// ����
	private static Map<String, Object> objMap = new HashMap<String, Object>();

	// ˽�й��췽��
	private SingletonManager() {
	}

	// ע�ᵥ��
	public static void ascendSingleton(String key, Object instance) {
		if (!objMap.containsKey(key)) {
			objMap.put(key, instance);
		}
	}

	// ��õ�������
	public static Object getInstance(String key) {
		return objMap.get(key);
	}
}