package api.lang.arrays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {

	public static void main(String[] args) {
		//현재 시간을 갖는 java.util.Date 인스턴스 생성
		Date currentTime = new Date();
		
		//출력
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성 - 년도에는 1900을 빼준 99, 월에는 1을 빼준 3 을 해야 원하는 1999.4.18 이 나옴
		Date firstMeetTime = new Date(99, 3, 18, 11, 30, 0); 
		//출력 - 년 월 일 시 분 초 출력
		System.out.println(firstMeetTime);
		//년도 만 추출해서 출력
		//firstMeetTime.setYear(1999);
		int birthYears = firstMeetTime.getYear()+1900;
		System.out.println(birthYears);
		
		//원하는 포맷으로 출력
		//1999년 4월 18일 ?요일 이라고 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(firstMeetTime));
		
		//과제 - 년 월 일을 비교해서 년 월 일이 같으면 시간 과 분을 그렇지 않으면 년 월 일을 출력
		
		
		
		
		
		
		
		
		

		
	}
}
