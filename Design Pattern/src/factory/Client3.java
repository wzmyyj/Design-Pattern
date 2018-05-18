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
			// 艾希工厂
			factory = new AsheFactory();
			break;
		case Yasuo:
			// 亚索工厂
			factory = new YasuoFactory();
			break;
		case Garen:
			// 德玛工厂
			factory = new GarenFactory();
			break;
		case Lux:
			// 光辉工厂
			factory = new LuxFactory();
			break;
		case Yi:
			// 剑圣工厂
			factory = new YiFactory();
			break;
		}
		Hero hero = factory.create();
		hero.say();
	}

}
