package factory;

public class LuxFactory implements Factory {
	//ʵ�־���Ĵ���Ӣ�۵ķ�����
	public Hero create() {
		return new Lux();
	}
}
