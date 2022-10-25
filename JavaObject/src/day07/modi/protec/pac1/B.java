package day07.modi.protec.pac1;

public class B {
	//생성자
	public B() {
		A a = new A();
		a.s = "홍길동";//동일 패키지 접근 가능.
		a.method();
	}
}
