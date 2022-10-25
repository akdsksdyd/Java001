package day08.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01();//상속
		c.method02();//오버라이드
		c.method03();//자식 클래스
		
		System.out.println("==========다형성==========");
		//자식이 부모에 저장되는데, 부모님처럼 사용되지만 단, 자식의 오버라이딩 된 메서드가 실행됩니다.
		Parent p = c; // Parent p = new Child();
		
		p.method01();
		p.method02();
		//p.method03(); X (자식 클래스에서 생성됐기 때문)
		System.out.println(p == c); //true 동일한 주소값을 나타냄.
		
		System.out.println("========클래스 캐스팅========");
		
		//다형성이 적용되면, 자식이 가지고 있던 본래의 기능을 사용 할 수 없기 때문에, 클래스 캐스팅을 사용.
		Child cc = (Child)p;
		cc.method01();
		cc.method02();
		cc.method03();
		
		System.out.println("=======주의 할 점=======");
		//다형성이 적용 된 객체만 캐스팅 가능.
		//Parent pp = new Parent();
		//Child ccc = (Child)pp; //error (부모 클래스가 자식 클래스로 형변환이 한번도 일어나지 않았기 때문)
		
	}
}
