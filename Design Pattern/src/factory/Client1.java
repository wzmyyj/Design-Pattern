package factory;

import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		String name = can.next();
		can.close();
		switch (Who.valueOf(name)) {
		case Ashe:
			// °¬Ï£
			Ashe ashe = new Ashe();
			ashe.say();
			break;
		case Yasuo:
			// ÑÇË÷
			Yasuo yasuo = new Yasuo();
			yasuo.say();
			break;
		case Garen:
			// µÂÂê
			Garen garen = new Garen();
			garen.say();
			break;
		case Lux:
			// ¹â»Ô
			Lux lux = new Lux();
			lux.say();
			break;
		case Yi:
			// ½£Ê¥
			Yi yi = new Yi();
			yi.say();
			break;
		}
	}

}
