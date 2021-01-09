package ws3.java2.entity;

public class Vehicle {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super();
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		
	}
	
	
	

	public String getModelName() {
		return modelName;
	}




	public void setModelName(String modelName) {
		this.modelName = modelName;
	}




	public int getMaxSpeed() {
		return maxSpeed;
	}




	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}




	public int getNumberLimit() {
		return numberLimit;
	}




	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}




	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + this.modelName);
		System.out.println(" 최고속도 : " + this.maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + this.numberLimit + "명");
	}
	private boolean available;


	public void setAvailable(boolean b) {
		
		
	}

}