package icehs.science.chapter09;

public class Taxi extends Car{
	private int maxNum;
	public int getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	@Override
	public void go(int distance) {
		System.out.println();
		System.out.println("연료 : " + super.getClass());
		System.out.println("택시 정원 : " + this.maxNum + "명");
	}
}
