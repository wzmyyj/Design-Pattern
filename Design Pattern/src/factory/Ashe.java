package factory;

public class Ashe extends Hero {

	// 简化构造方法，只弄个名字。
	public Ashe() {
		this.name = "寒冰射手-艾希";
	}

	// 艾希台词
	protected void say() {
		System.out.println(name + "：" + "世间万物皆系于一箭之上。");
	}
}
