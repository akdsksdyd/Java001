package day08.poly.instanceof_;

public class Student extends Person{

	String studentID; //학번

	Student(String name, int age, String studentId){
		super(name, age);
		//		this.name = name;
		//		this.age = age;
		this.studentID = studentId;
	}

	String info() {
		return super.info() + ", 학번:" + studentID;
	}
}
