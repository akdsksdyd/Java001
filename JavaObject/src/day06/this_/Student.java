package day06.this_;

public class Student extends Person{

	String studentID; //학번
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentID = studentId;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentID;
	}
}
