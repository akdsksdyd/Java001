package day09.inter.inherit;

public class MainClass {

	public static void main(String[] args) {
		
		//똑같음
		MyClass me = new MyClass();
		//Inter3 me = new MyClass();
		//me.some04();
		
		//inter2의 기능만 사용 할 수 있따(오버라이드 된 메서드 실행)
		Inter2 m = new  MyClass();
		m.some03();
		m.some04();
		
		//inter1 의 기능만 사용 할 수 있다
		Inter1 m1 = new MyClass();
		m1.some01();
		m1.some02();
	}
}
