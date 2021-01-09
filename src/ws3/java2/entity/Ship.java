package ws3.java2.entity;

public class Ship extends Vehicle {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int replacement;
	private boolean available;
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		super(modelName, maxSpeed, numberLimit, replacement);
		this.replacement = replacement;
	}

	
	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

	

	public void displayInfo() {
		System.out.println(" ¹è¼ö·®: " + this.replacement + "Åæ");
	}
}