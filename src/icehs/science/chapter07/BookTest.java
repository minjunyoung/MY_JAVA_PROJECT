package icehs.science.chapter07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "아즈카반의 죄수";
		book1.price = 15000;
		book1.printBookInfo();
		
		Book book2 = new Book("해리포터 ", 20000);
		book2.printBookInfo();	
		
		Book book3 = new Book(" 365 in")

	}

}
