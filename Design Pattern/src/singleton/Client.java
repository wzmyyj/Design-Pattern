package singleton;

//¿Í»§¶Ë

public class Client {
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		Singleton3 s3 = Singleton3.getInstance();
		Singleton4 s4 = Singleton4.getInstance();

		SingletonManager.ascendSingleton("s1", s1);
		SingletonManager.ascendSingleton("s2", s2);
		SingletonManager.ascendSingleton("s3", s3);
		SingletonManager.ascendSingleton("s4", s4);

		Singleton1 ss1 = (Singleton1) SingletonManager.getInstance("s1");
		Singleton2 ss2 = (Singleton2) SingletonManager.getInstance("s2");
		Singleton3 ss3 = (Singleton3) SingletonManager.getInstance("s3");
		Singleton4 ss4 = (Singleton4) SingletonManager.getInstance("s4");

		SingletonEnum sEnum = SingletonEnum.INSTANCE;

		System.out.println("s1:" + ss1);
		System.out.println("s2:" + ss2);
		System.out.println("s3:" + ss3);
		System.out.println("s4:" + ss4);
		System.out.println("s5:" + sEnum);

	}

}
