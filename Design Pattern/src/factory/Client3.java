package factory;

import java.util.Scanner;

public class Client3 {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		String name = can.next();
		can.close();
		Factory factory = null;
		switch (Who.valueOf(name)) {
		case Ashe:
			// ��ϣ����
			factory = new AsheFactory();
			break;
		case Yasuo:
			// ��������
			factory = new YasuoFactory();
			break;
		case Garen:
			// ���깤��
			factory = new GarenFactory();
			break;
		case Lux:
			// ��Թ���
			factory = new LuxFactory();
			break;
		case Yi:
			// ��ʥ����
			factory = new YiFactory();
			break;
		}
		Hero hero = factory.create();
		hero.say();
	}

}
