package day09.inter.basic3;

public class PetHouse {
	//1. IPet타입을 매개변수로 받아서 기능을 출력하는 static 메서드
	public static void method01(IPet p) {
		p.play();
	}
	
	
	//2. IPet[] 타입을 받아서, 배열 내부 Pet들의 play기능을 실행하는 static 메서드
	public static void method02(IPet[] p) {
		for(IPet i : p) i.play(); 
			
		
	}
}
