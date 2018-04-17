package singleton;

//����ʽ����
//�ڵ�һ�ε���getInstance()ʱ��������������
//synchronized�ؼ������Σ�ʹgetInstance()��һ��ͬ��������
//��֤���߳�����µ��������Ψһ�����ǣ�ͬ����ķ���Դ��

public class Singleton2 {
	// ��������
	private static Singleton2 INSTANCE = null;

	// ˽�й��췽��
	private Singleton2() {
	}

	// synchronized�ؼ������ξ�̬����
	public static synchronized Singleton2 getInstance() {
		if (null == INSTANCE) {// ��ֵ�ж�
			INSTANCE = new Singleton2();
		}
		return INSTANCE;
	}
}