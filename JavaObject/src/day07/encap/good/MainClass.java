package day07.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth me =  new MyBirth();
		
		me.setYear(2022); // 값저장.
		int year = me.getYear();
		
		me.setMonth(10);
		int month = me.getMonth();
		
		me.setDay(11);
		int day = me.getDay();
		System.out.println(year + "년" + month + "월" + day + "일");
		
		me.setSsn("123456-1234567");
		String ssn = me.getSsn();
				System.out.println(ssn);
	}
}
