package factory;

public class SimpleFactory {

	public static Hero create(String name) {
		Hero hero = null;
		switch (Who.valueOf(name)) {
		case Ashe:
			// ��ϣ
			hero = new Ashe();
			break;
		case Yasuo:
			// ����
			hero = new Yasuo();
			break;
		case Garen:
			// ����
			hero = new Garen();
			break;
		case Lux:
			// ���
			hero = new Lux();
			break;
		case Yi:
			// ��ʥ
			hero= new Yi();
			break;
		}

		return hero;
	}

}
