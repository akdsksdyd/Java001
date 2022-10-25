package day07.modi.protec.pac2;

import day07.modi.protec.pac1.A;

public class C extends A{

	public C() {
		//		A a = new A();
		//		a. = "홍길동";
		//		a.method();
		
		//패키지가 다르더라도, super 키워드를 통한 접근은 가능.
		super();
		super.s = "홍길동";
		super.method();
	}
	
}
