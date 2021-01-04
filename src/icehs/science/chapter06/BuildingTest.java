package icehs.science.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
	Bulding building = new Bulding();
	
	building.name = " 국제선타워" ;
	building.address = "김포동";
	building.totalFloor = 5;
	
	System.out.println( "건물명 : " + building.name);
	System.out.println( " 주소 : " + building.address );
	System.out.println( " 전체 층 수 : " + building.totalFloor);
	building.moveElevator();
	building.changeAddress( "비행기");
	System.out.println( " 새 주소 : " + building.address );
}
}