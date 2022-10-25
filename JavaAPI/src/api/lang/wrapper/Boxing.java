package api.lang.wrapper;

import java.util.Scanner;

public class Boxing {

	public static void main(String[] args) {

		int a = 100;
		double b = 3.14;
		long c = 200L;

		//기본형 -> 객체형 포장하는 작업을 boxing이라 함.
		Integer val = new Integer(a); //주솟값이 안나오고 값 자체를 출력해줌.
		System.out.println(val);
		Double val2 = new Double(b);
		Long val3 = new Long(c);

		Object[] arr = {val, val2, val3}; //객체형 변수를 Object배열에 저장

		//객체형 -> 기본형 변경하는 작업 unboxing 이라 함.
		int a1 = val.intValue();
		double b1 = val2.doubleValue();
		long c1 = val3.longValue();

		Scanner scan = new Scanner(System.in);
		//실수 문자열을 입력받아서 실수로 변경하고 출력하는 프로그램
		System.out.println("실수를 입력하세요:");
		String su = scan.nextLine();
		try {
			//실수 문자열을 실수로 변경
			Double silsu = Double.parseDouble(su);
		
			//실수를 문자열로 변환
			String msg = silsu.toString();
			System.out.println(msg);
		}catch(Exception e) {
				System.out.println("변환에 실패");
			}
		scan.close();
	}
}
