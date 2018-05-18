package factory;

public class Garen extends Hero {

	// 简化构造方法，只弄个名字。
	public Garen() {
		this.name = "德玛西亚之力-盖伦";
	}

	// 盖伦台词
	protected void say() {
		System.out.println(name+"："+"人在塔在！");
	}
}
