package day09.abs.good;

public class MainaClass {

	public static void main(String[] args) {
		
		//1. 추상클래스는 객체 생성이 안된다.
		// 반드시 자식으로 구체화 된다.
		
		Store s = new BusanStore(); // new SeoulStore();
		//클래스 추상화
		s.apple();
		s.melon();
		s.orange();
		System.out.println(s.getName()); //상속받은것
		
		
		
		
		
		
	}
}
