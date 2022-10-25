package day10.exception.trycatch;

public class MultiCatchEx01 {

	public static void main(String[] args) {
		
		//main에 args사용방법
		//run -> run configration -> argments탭 //띄어 쓰기를 기준으로 배열의 0번째부터 순서대로 넣어줌.
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int n1 = Integer.parseInt(data1);
			int n2 = Integer.parseInt(data2);
			
			System.out.println("두 수의 핪:" + (n1+n2));
			
			String s = null;
			s.charAt(0);
			//정확한 예외 클래스나 그 부모 예외 클래스를 넣어줘야함.
		} catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("매개값은 2개 입력하세요");
			
		} catch (NumberFormatException e) {
			System.out.println("매개값은 숫자로 입력하세요");
			
		//다중 예외처리를 할 때는 Exception은 무조건 마지막에 넣어야함.
		} catch (Exception e) { //어떤 실행 예외든 처리 가능 ( Exception == 예외의 부모) (ctrl + t)
			System.out.println("기타 예외 입니다");
			
		}
		
		
	}
}
