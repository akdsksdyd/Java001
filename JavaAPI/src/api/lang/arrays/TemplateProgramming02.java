package api.lang.arrays;

class Generics <T>{//이름은 아무거나 상관없지만 대부분 한글자를 대문자로 함.
	//어떤 종류의 데이터든지 생성자에서 갯수에 상관없이 받아서 처리하는 제너릭스
	private  T[] data;
	
	
	//...은 variable args 로 갯수에 상관없이 매개변수를 받고자 할 때 사용
	//받은 매개변수들은 배열로 만들어진다.
	public Generics(T ... n) {
		this.data = n;
	}
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display() {
		for(T temp : data) {
			System.out.println(temp);
		}
	}
}

public class TemplateProgramming02 {

	public static void main(String[] args) {
		Generics <String> g1 = new Generics<String>("Karina", "Suzi", "IU");
		g1.display();
		Generics <Integer> g2 = new Generics<Integer>(100, 300, 200, 400);
		g2.display();
	}
}
