package factory;

public class GarenFactory implements Factory {
	//ʵ�־���Ĵ���Ӣ�۵ķ�����
	public Hero create() {
		return new Garen();
	}
}
