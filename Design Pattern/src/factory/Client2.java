package factory;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		String name = can.next();
		can.close();
		Hero hero = null;
		switch (Who.valueOf(name)) {
		case Ashe:
			// ��ϣ
			hero = new Ashe();
			break;
		case Yasuo:
			// ����
			hero = new Yasuo();
			break;
		case Garen:
			// ����
			hero = new Garen();
			break;
		case Lux:
			// ���
			hero = new Lux();
			break;
		case Yi:
			// ��ʥ
			hero = new Yi();
			break;
		}
		hero.say();
	}

}
