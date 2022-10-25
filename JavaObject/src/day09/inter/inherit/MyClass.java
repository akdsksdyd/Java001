package day09.inter.inherit;

public class MyClass implements Inter3{
	//인터페이스를 상속 받을 떄 메서드 재정의 하는 이유는
	//인터페이스 에서 메서드를 받을 때 {} (몸통) 없이 만들어 놓기 때문에 만들어 주는 것.
	public void some01() {
		System.out.println("Inter1 some1 오버라이드");
	}
	public void some02() {
		System.out.println("Inter1 some2 오버라이드");
	}
	public void some03() {
		System.out.println("Inter2 some3 오버라이드");
	}
	public void some05() {
		System.out.println("Inter3 some5 오버라이드");
	}
	
}
