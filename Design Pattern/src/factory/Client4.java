package factory;

import java.util.Scanner;

public class Client4 {
	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		String name = can.next();
		can.close();
		// 根据传入的名字构建不同的英雄。
		Hero hero = SimpleFactory.create(name);
		hero.say();
	}
}
