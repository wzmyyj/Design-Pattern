package factory;

public class AsheFactory implements Factory {
	//ʵ�־���Ĵ���Ӣ�۵ķ�����
	public Hero create() {
		return new Ashe();
	}
}
