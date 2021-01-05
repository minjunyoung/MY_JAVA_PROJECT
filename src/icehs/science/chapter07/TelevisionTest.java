package icehs.science.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television infinia = new Television(" INFINIA" , 1500000);
		infinia.printTelevisionInfo();
		
		Television xcanvas = new Television(" xcanvas " , 2000000, "LCD TV");
		xcanvas.printTelevisionInfo();
		
		Television cinema = new Television(" cinema " , 4500000);
	}

}
