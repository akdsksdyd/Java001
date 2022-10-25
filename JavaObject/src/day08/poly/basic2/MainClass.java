package day08.poly.basic2;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		//다형성을 적용한 배열
		Student s = new Student("홍길동", 20, "123123") ;

		Teacher t = new Teacher("홍길자", 30, "프로그램");

		Employee e = new Employee("홍길순", 40, "취업지원팀");

		//Object[] arr = {s, t, e};
		Person[] arr = {s, t, e};

		for(Person p : arr) {
			System.out.println(p.info()); //오버라이딩 된 메서드 실행.


		}

		printInfo(e);
		printInfo(s);
		printInfo(t);

		House h = new House();
		h.setPerson(s);
		h.setPerson(t);
		h.setPerson(e);
		Person[] ar = h.getArr();
		//		for(Person p : ar) {
		//			if(p == null) break;
		//			System.out.println(p.info());
		//		}
		System.out.println(Arrays.toString(ar));
	}

	public static void printInfo(Person p) {
		System.out.println(p.info());
	}




}
