package singleton;

public class Singleton1 {
	// ��������
	private final static Singleton1 INSTANCE = new Singleton1();

	// ��
	// private final static Singleton INSTANCE;
	// static {
	// INSTANCE = new Singleton();
	// }

	// ˽�й��췽��
	private Singleton1() {
	}

	// ���о�̬�������ڻ�ȡ��������
	public static Singleton1 getInstance() {
		return INSTANCE;
	}
}
