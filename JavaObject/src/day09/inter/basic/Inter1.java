package day09.inter.basic;

public interface Inter1 { //상속해서 사용해야함.

	//인터페이스는 객체 생성이 불가.
	//상수, 추상메서드 +@ (default메서드, static메서드)
	
	double PI = 3.14; //인터페이스에 변수를 선언 -> public 상수로 선언 된다.(초기값 반드시 지정,)
	void method01(); //인터페이스에 메서드를 선언 -> public 추상메서드가 된다.
	
	
		
	
}
