package naver.lljaewon33.Queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import naver.lljaewon33.stack.PersonVO;

public class Main {

	public static void main(String[] args) {
		//PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		//이 상태에서 만들면 PersonVO의 크기 비교를 할 수 없기 때문에 예외 발생
		
		//PersonVO클래스에 Comparable 인터페이스를 implements하고
		//compareTo라는 메서드를 재정의해서 해결 할 수 있고
		
		//Comparator 인터페이스를 대입 받을 수 있는 경우에는 Comparator인터페이스를
		//구현한 클래스의 인스턴스를 이용해서 생성해도 됨
		//PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		
		//데이터 저장
		//intQueue.offer(100);
		//intQueue.offer(70);
		//intQueue.offer(90);
		
		//데이터 꺼내기 tree 구조 라서 실제로는 정렬은 안했지만 출력은 정렬되서 나옴.
		//System.out.println(intQueue.poll());
		//System.out.println(intQueue.poll());
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {
			//정렬을 할 때는 반드시 크기 비교가 되어야 한다.
			public int compare(PersonVO o1, PersonVO o2) {
				
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
		});
		
		persons.offer(new PersonVO(1, "재원", new Date(99, 3, 18), "01071112222"));
		persons.offer(new PersonVO(2, "준형", new Date(99, 9, 22), "01021112222"));
		persons.offer(new PersonVO(3, "아담", new Date(), "01033334444"));
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
	}
}
