package factory;

public class Yi extends Hero{
	
	// 简化构造方法，只弄个名字。
	public Yi() {
		this.name = "无极剑圣-易";
	}

	// 易台词
	protected void say() {
		System.out.println(name+"："+"我的剑，就是你的剑。");
	}
}
