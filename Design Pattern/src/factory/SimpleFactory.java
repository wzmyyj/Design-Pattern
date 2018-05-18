package factory;

public class SimpleFactory {

	public static Hero create(String name) {
		Hero hero = null;
		switch (Who.valueOf(name)) {
		case Ashe:
			// °¬Ï£
			hero = new Ashe();
			break;
		case Yasuo:
			// ÑÇË÷
			hero = new Yasuo();
			break;
		case Garen:
			// µÂÂê
			hero = new Garen();
			break;
		case Lux:
			// ¹â»Ô
			hero = new Lux();
			break;
		case Yi:
			// ½£Ê¥
			hero= new Yi();
			break;
		}

		return hero;
	}

}
