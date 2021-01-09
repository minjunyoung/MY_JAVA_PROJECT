  
package ws3.java2.entity;

public class Airplane extends Vehicle{
	
	private int numOfEngine;
	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super(modelName , maxSpeed , numberLimit, numOfEngine);
		this.numOfEngine = numOfEngine;
	}

	
	public String getModelName() {
		return getModelName();
	}


	


	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}


	
	

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("엔진 개수 : " + this.numOfEngine + "개");
	}
}