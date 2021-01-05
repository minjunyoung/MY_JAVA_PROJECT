package icehs.science.chapter07;

public class Book {
	private String title;
	private int price;
	private String author;
	
	public Book() {
		
	}
	public Book(String title) {
		this.tilte;
	}

	public Book(String Title, int Price) {
		this(title);
		this.price = Price;
		
				
	}
	public Book(String Title , String Author , int price) {
		this( title, price);
		this.author = Author;
		
	}
	void printBookInfo() {
		System.out.println(this.title);
		System.out.println(this.price);
	}
}
