package factory;

public class YiFactory implements Factory {
	//ʵ�־���Ĵ���Ӣ�۵ķ�����
	public Hero create() {
		return new Yi();
	}
}
