package factory;

public class Lux extends Hero{

	// 简化构造方法，只弄个名字。
	public Lux() {
		this.name = "光辉女郎-拉克丝";
	}

	// 拉克丝台词
	protected void say() {
		System.out.println(name+"："+"真是个深思熟虑的选择。");
	}
}
