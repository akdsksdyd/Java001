package day06.super_;

public class MainClass {

	public static void main(String[] args) {

		//		Person p = new Person(); //부모님
		//		
		//		System.out.println(p.info());
		//		
		//		Person p2 = new Person("honggildong",20);
		//		System.out.println(p2.info());
		//		
		//		Person p3 = new Person("honggilja");
		//		System.out.println(p3.info());
		//		
		//		Teacher t = new Teacher("이순신", 20, "프로그램");
		//		System.out.println(t.info());
		
		// super.메서드() --> 부모 클래스의 기본 메서드 호출.
		Mother m = new Mother();
		System.out.println(m.info());
		
		Employee e = new Employee("이순식", 20, "역사");
		System.out.println(e.info());
		
		
	}
}
