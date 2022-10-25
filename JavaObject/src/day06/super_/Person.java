package day06.super_;

public class Person {//부모클래스로 사용.

	String name;
	int age; 

	//	Person(){
	//		this("홍길동" ,1);
	//	}

	Person(String name){
		this(name, 1);
	}
	Person(String name, int age){ // 전부 에러 기본 생성자 만들어야함.
		//		super();  //생략되어있음
		super();
		this.name = name.toUpperCase();
		this.age = age;
		//System.out.println("100줄 짜리 코드.....");

	}
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}

}
