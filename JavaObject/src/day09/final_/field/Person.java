package day09.final_.field;

public class Person {

	/*
	 * final변수는 값을 변경 할 수 없기 때문에
	 * 직접 초기값을 지정하거나 or 생성자를 통해서 초기화를 해야한다.
	 */
	public String nation = "대한민국";
	public String ssn;
	public String name;
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
