package api.lang.arrays;

public class PersonVO implements Comparable<PersonVO>{

	private int num;
	private String name;
	private int age;
	
	//매개변수가 없는 생성자 - Default Constructor
	public PersonVO() {
		
	}
	
	//속성을 전부 매개변수로 받는 생성자 - 인스턴스 생성 후 값을 빠르게 대입하기 위해서 생성
	public PersonVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	//getter & setter : 속성의 값에 접근하고 변경하기 위한 메서드
	//일반적으로 VO 클래스의 경우는 setter를 만들지 않음
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//데이터 출력을 편리하게 하기 위한 메서드
	//출력하는 메서드에 인스턴스 이름을 대입하면 이 메서드가 호출되서 출력.
	public String toString() { 
		return "[번호=" + num + ", 이름=" + name + ", 나이=" + age + "]";
	}
	//크기 비교하는 메서드
	@Override
	public int compareTo(PersonVO o) {
		//크기 비교 방법 설정
		//return (this.age - o.age) *-1
		//return o.age - this.age; // 앞을 기준으로 앞이 크면 양수 같으면 0 작으면 음수 (정수형 비교)
		return this.name.compareTo(o.name); // 문자열 비교
		
		
	}
	
	
	
	
	
}
