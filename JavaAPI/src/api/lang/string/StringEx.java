package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		String s = "홍길동";
		char a = s.charAt(0);
		System.out.println(a);
		
		//길 문자를 찾으면 위치반환, 못 찾으면 -1반환
		int index = s.indexOf("길");
		System.out.println("길 시작위치:" + index);
		
		//replace - 원본 문자는 원래 유지
		String result = s.replace("길", "");
		//s = s.replace("길", ""); 원본 문자 바꾸는 식
		System.out.println("바꾼 문자열:" +result);
		System.out.println("원본 문자열:" + s);
		//CharSequence ss = "sdf";
		
		//substring
		String s2 = "오늘은 날씨가 추워요";
		String result2 = s2.substring(4); //4미만 절삭
		System.out.println(result2); 
		
		String result3 = s2.substring(4, 7); //4이상 7미만 추출
		System.out.println(result3);
		
		//trim - 앞 뒤 공백 제거
		System.out.println("        홍길동".trim()  );
		
		//split - 문자열 자르기
		String[] result4 = s2.split(" ");
		System.out.println(Arrays.toString(result4));
		
		//매개변수 2개 주면 배열의 크기를 제한 할 수 있음
		String[] result5 = "010-1234-3456".split("-", 3);
		System.out.println(Arrays.toString(result5));
		
		//문자열 포함여부
		if(s.contains("홍")) {
			System.out.println("홍 이 포함됨");
		}
		
		//복사해서 합치고 String으로 반환
		String result6 = String.copyValueOf(new char[] {'a', 'b', 'c'});
		System.out.println(result6);

		String result7 = String.valueOf(3);
		System.out.println("문자열 바뀐결과:" + result7);
		
		
	}
}
