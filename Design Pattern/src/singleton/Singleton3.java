package singleton;

public class Singleton3 {
	// ��������volatile�ؼ��ֱ�֤INSTANCE��ԭ����
	private volatile static Singleton3 INSTANCE = null;

	// ˽�й��췽��
	private Singleton3() {
	}

	// ���ο�ֵ��飬synchronized�ؼ���ͬ��
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
