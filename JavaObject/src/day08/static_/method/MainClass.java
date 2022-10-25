package day08.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.some1();
		c.some2();
		//정적메서드 - 객체 생성 없이 사용.
		Count.some2();
		//현재 b는 ? 3
		
		//main은 static 이기 때문에
		a();
		
		Math.random();
		Integer.parseInt("3");
		Arrays.toString(new int[3]);
	}
	public static void a() {
		
	}
}
