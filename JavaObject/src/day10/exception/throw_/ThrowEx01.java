package day10.exception.throw_;

public class ThrowEx01 {

	public static void main(String[] args) {
		try {
			System.out.println(calc(10));
			System.out.println(calc(-10));
			
		} catch (Exception e) {
			e.printStackTrace(); //예외의 내용을 로그로 출력해주는 기능.
			System.out.println(e.getMessage()); //예외 생성시에 만들어진 메시지를 확인가능.
		}
		
	}
	
	//잘못된 값이 전달되면 예외를 만들어서 메서드 강제 종료
	public static int calc(int n) throws Exception {
		
		if(n<=0) {
			throw new Exception("0이상으로 값을 전달하세요"); //예외 강제생성 - 예외를 생성하면 예외처리 구문이 필요
			
		}
		int sum = 0;
		for(int i =0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
