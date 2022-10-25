package day09.inter.default_;

public class MainClass {

	public static void main(String[] args) {
		
		MyInter i = new MyClass();
		i.some1(); //오버라이딩 된 메서드
		i.some2(); //default 메서드
		MyInter.some3(); // static메서드
		System.out.println(MyInter.PI);//상수 
		
	}
}
