package singleton;

//��̬�ڲ��൥��
//��һ�μ���Singletonʱ��SingletonHolder���ᱻ���ء�
//ֻ�õ���getInstance()ʱ���ż���SingletonHolder��������INSTANCE��
//�Ƽ����ʹ�á�

public class Singleton4 {
	// �ڲ��࣬���������Ķ���
	private static class SingletonHolder {
		public static final Singleton4 INSTANCE = new Singleton4();
	}

	// ˽�й��췽��
	private Singleton4() {
	}

	// ���о�̬�������ڻ�ȡ��������
	public static final Singleton4 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
