package factory;

public class Yasuo extends Hero{

	// 简化构造方法，只弄个名字。
	public Yasuo() {
		this.name = "疾风剑豪-亚索";
	}

	// 亚索台词
	protected void say() {
		System.out.println(name+"："+"死亡如风，常伴吾身。");
	}
}
