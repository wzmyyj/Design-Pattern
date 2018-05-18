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
			// °¬Ï£
			hero = new Ashe();
			break;
		case Yasuo:
			// ÑÇË÷
			hero = new Yasuo();
			break;
		case Garen:
			// µÂÂê
			hero = new Garen();
			break;
		case Lux:
			// ¹â»Ô
			hero = new Lux();
			break;
		case Yi:
			// ½£Ê¥
			hero = new Yi();
			break;
		}
		hero.say();
	}

}
