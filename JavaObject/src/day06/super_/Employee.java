package day06.super_;

public class Employee extends Person{

	String department; //부서

	Employee(String name, int age, String department) {
		super(name, age); //결론적으론 이 구문과 밑 구문이 똑같다.
		//		super();
		//		this.name = name;
		//		this.age = age;
		this.department = department;
	}
	//오버라이딩
	String info() {
		//super.메서드() - 오버라이딩 된 메서드에서 부모님의 원형메서드가 필요 할 떄 사용 가능.
		return super.info() + ", 부서:" + department;
	}

}
