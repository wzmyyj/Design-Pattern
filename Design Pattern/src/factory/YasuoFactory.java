package factory;

public class YasuoFactory implements Factory {
	//ʵ�־���Ĵ���Ӣ�۵ķ�����
	public Hero create() {
		return new Yasuo();
	}
}
