package icehs.csience.chapter08;

public class IdolTest {

	public static void main(String[] args) {
		Idol[] idols = new Idol[4];
		idols[0] = new Idol("¼Ò³à½Ã´ë", "ÅÂ¿¬");
		idols[1] = new Idol("¾¾½ºÅ¸","º¸¶ó");
		idols[2] = new Idol("ºò¹ð","Áöµå·¡°ï");
		idols[3] = new Idol("ºñ½ºÆ®","¾ç¿ä¼·");
		
		}
		System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
		System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
		System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
	}

