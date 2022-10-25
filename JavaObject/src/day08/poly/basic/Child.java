package day08.poly.basic;

public class Child extends Parent {

	
	// alt + Shift + s -> Override/implement Methods
	@Override //오버라이딩 됐다고 알려주는 아무런 기능 없는 문구.
	public void method02() {
		System.out.println("오버라이드 된 2번 메서드");
	}
	public void method03() {
		System.out.println("자식의 3번 메서드");
		
	}
	
}
