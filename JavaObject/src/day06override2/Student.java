package day06override2;

public class Student extends Person{

	String studentID; //학번
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentID;
	}
}
