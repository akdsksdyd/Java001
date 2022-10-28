package naver.lljaewon33.nestedclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//메서드가 1개인 인터페이스
interface Sample{
	//추상 메서드 선언
	public void display();
	
}

//인터페이스를 구현한 클래스
class SampleImpl implements Sample{

	@Override
	public void display() {
		System.out.println("클래스를 만들어서 사용");
	}
	
}

public class AnonymousMain {

	public static void main(String[] args) {
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		//인스턴스를 여러 개 만들어야 한다면 클래스를 만드는 것이 효율적
		Sample sample = new SampleImpl();
		sample.display();
		
		//Sample 인터페이스를 annonymous로 사용
		//인스턴스가 1개만 필요하다면 클래스를 만들지 않는 것이 효율적
		new Sample() {

			@Override
			public void display() {
				System.out.println("클래스를 생성하지않고 사용"); 
			}
		}.display();
		//배열의 정렬
		String[] ar = {"강남", "건대", "역삼", "성수"};
		
		//배열의 내림차순 정렬
		//Arrays.sort(배열, 비교를 위한 Comparator<T> 인터페이스를 구현한 클래스의 객체) 를 호출
		//Comparator는 메서드가 1개만 존대
		Arrays.sort(ar, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				return o2.compareTo(o1);
			}
		});
		
		//Comparator 인터페이스는 메서드가 1개밖에 없으므로 람다로 표현하는 것이 가능
		//람다를 만들 때는 인터페이스 이름과 메서드 이름은 중요하지 않음
		//매개변수의 갯수와 리턴 타입만 확인하면 된다.
		//매개변수는 2개이고 리턴 타입은 정수
		//매개변수가 1개면 ()생략가능
		// return 하는 문장만 존재한다면 {}와 return 을 생략하는 것이 가능
		//메서드의 매개변수로 코드(함수)를 대입한 것 처럼 보이도록 함
		//메서드의 매개변수로 코드를 대입할 수 있는 방식을 함수형 프로그래밍이라고 함
		Arrays.sort(ar, (o1, o2) -> o2.compareTo(o1));
		
		//배열의 요소를 빠르게 확인
		System.out.println(Arrays.toString(ar));
	}
		
	
}











