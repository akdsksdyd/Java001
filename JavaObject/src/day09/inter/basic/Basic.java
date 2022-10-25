package day09.inter.basic;

//인터페이스는 implements키워드로 상속을 받는다.
public class Basic /*extends Object */ implements Inter1, Inter2{
	@Override
	public void method01() {
		System.out.println("오버라이딩 된 inter1 메서드");
	}

	@Override
	public void method02() {
		System.out.println("오버라이딩 된 inter2 메서드");
	}
	
}
