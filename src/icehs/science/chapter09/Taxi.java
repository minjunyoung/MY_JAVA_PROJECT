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
		System.out.println("���� : " + super.getClass());
		System.out.println("�ý� ���� : " + this.maxNum + "��");
	}
}
