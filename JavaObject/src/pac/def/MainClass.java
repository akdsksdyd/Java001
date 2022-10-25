package pac.def;

import java.util.Scanner;

//import pac.abc.Apple;  패키지명을 포함한 클래스명
//import pac.abc.Banana;
import pac.abc.*;

public class MainClass {

	public static void main(String[] args) {
		
		Melon m = new Melon();
		Apple a = new Apple();
		Banana b = new Banana();
		
		Scanner scan = new Scanner(System.in);
		System.out.println(m); // m의 주소 값
		System.out.println(new int[3]); // 주소 값
	}
}
