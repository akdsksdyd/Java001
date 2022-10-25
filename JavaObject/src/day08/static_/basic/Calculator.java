package day08.static_.basic;

public class Calculator {//사용자 클래스
	//계산기마다 다른값을 지니면 일반변수
	//계산기마다 같은 값이라면 정적변수 
	private String moder;
	private int result;
	public static double pi = 3.14;
	
	//일반 멤버변수를 사용하는 메서드는 static쓰면 안됨.
	public String getModer() {
		return moder;
	}
	public void setModer(String moder) {
		this.moder = moder;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	/*
	 * 일반 변수를 사용하지 않고, 범용성 있게 사용 할 메서드는 static을 붙이면 좋다,
	 */
	public static double circle(int r) {
		return Math.PI * r * r;
		
	}
	
}
