package ua.com.itea;

public class Translation {
	private  String ePhrase;
	private String sPhrase;
	private String gPhrase;
	public Translation(String e, String s, String g) {
		ePhrase = e;
		sPhrase = s;
		gPhrase = g;
	}
	public  String getSpanishTranslation() {
		return sPhrase;
	}
	public  String getGermanTranslation() {
		return gPhrase;
	}
	public  String getEnglishTranslation() {
		return ePhrase;
	}
}
