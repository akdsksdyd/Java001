package day07.encap.good;

public class MyBirth {

	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 은닉 된 변수에 접근 할 때 클래스 설계자가 만들어 놓은
	 * getter/setter메서드 사용
	 * 국룰 - get시작(값은 얻는다), set작(값을 저장)
	 * 
	 *  set메서드
	 *  1. 값을 저장하는 메서드
	 *  2. public으로 선언하고 set + 멤버변수로 저장
	 *  
	 */
	public void setYear(int year) {
		//유효값 검증
		if(year > 2022 || year < 1900) {
			System.out.println("년도는 1900~2022 년 까지 입니다");
		}else {
			System.out.println("저장완료");
			this.year = year;
		}

	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("1월~12월");
		}else {
			this.month = month;
		}

	}
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("1일~31일");
		}else {
			this.day = day;
		}
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String getSsn() {
		
		return ssn.replace("-"," ");
	}
	/*
	 * getter메서드
	 * 1. 값을 조회하는 메서드
	 * 2. public으로 선언하고  get + 멤버 변수명으로 지정.
	 * 
	 * month, day, ssn에 대한 getter, setter생성
	 * month - 1~12월 까지만 저장
	 * day - 1~31일 까지만 저장
	 * ssn- 하이픈을 제거하고 13자리 까지만 저장
	 */
	private String replace(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}






}
