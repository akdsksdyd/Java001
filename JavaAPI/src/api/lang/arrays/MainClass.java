package api.lang.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		PersonVO[] persons = {
				new PersonVO(1, "수지", 29),
				new PersonVO(2, "아이유", 30),
				new PersonVO(3, "카리나", 23),
				new PersonVO(4, "아담", 46)
		};
		//Arrays.sort 메서드는 배열을 대입하면 부등호 또는 compareTo라는 메서드를 호출해서
		//크기 비교룰 한 후 정렬을 수행해 준다.
		//Arrays.sort(persons); // 에러 이유 -> PersonVO 에는 크기 비교를 할 수 있는 메서드가 존재하지 않기 떄문.
		// ---------> PersonVO에 크기 비교하는 메서드 만든 후 다시 실행

		//동적으로 크기 비교 하는 메서드 설정
		//1.이름의 오름차순 2. 이름의 내림차순 3. 나이의 오름차순 4. 나이의 내림차순
		Scanner scan = new Scanner(System.in);
		System.out.println("1.이름의 오름차순 2. 이름의 내림차순 3. 나이의 오름차순 4. 나이의 내림차순");
		String menu = scan.nextLine();
		switch(menu.trim()) {
		case"1":
			System.out.println("이름의 오름차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					
					return o1.getName().compareTo(o2.getName());
					
				}
			});
			break;
		case"2":
			System.out.println("이름의 내림차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					
					return o2.getName().compareTo(o1.getName());
				}
			});
			break;
		case"3":
			System.out.println("나이의 오름차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					
					return o1.getAge()- o2.getAge();
				}
			});
			break;
		case"4":
			System.out.println("나이의 내림차순");
			Arrays.sort(persons, new Comparator<PersonVO>() {
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					
					return o2.getAge()- o1.getAge();
				}
			});
			break;
			default:
				System.out.println("1-4번만 선택");
				break;
		
		}
		scan.close();
		//		Arrays.sort(persons, new Comparator<PersonVO>() {
		//
		//			@Override
		//			public int compare(PersonVO o1, PersonVO o2) {
		//				
		//				return o2.getAge() - o1.getAge();
		//			}
		//			
		//		});


		//배열의 데이터 출력
		//Arrays.toString 은 배열의 각 요소의 toString을 전부 호출해서
		//하나의 문자열로 리턴하는 메서드
		System.out.println(Arrays.toString(persons));

		//System.out.println(System.identityHashCode(persons)); //정확한 해시코드 값( == -> 해시코드를 비교하는 것)


	}
}
