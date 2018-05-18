package factory;

public class GarenFactory implements Factory {
	//实现具体的创建英雄的方法。
	public Hero create() {
		return new Garen();
	}
}
