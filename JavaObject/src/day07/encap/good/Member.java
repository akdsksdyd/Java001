package day07.encap.good;

public class Member {

	//회원정보 저장
	private String id;
	private String pw;
	private String name; 
	private String email;
	private String addr;
	private int age;
	
	//기본생성자 컨트롤 + 스페이스바 + 엔터
	public Member() {
	}
	
	//생성자 알트 + 쉬프트 + s -> Generate Constructor using Fields
	public Member(String id, String pw, String name, String email, String addr, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter, setter -> 12개
	//자동완성 alt + shift + s 또는 source탭 -> Generate getters and setters -> 항목 선택 후 완료.
	
	
}
