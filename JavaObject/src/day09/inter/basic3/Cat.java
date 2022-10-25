package day09.inter.basic3;

public class Cat extends Animal implements IPet{

	public void eat() {
		System.out.println("고양이는 생선을 먹어요");
		
	}
	public void play() {
		System.out.println("고양이는 방에서 놀아요");
	}
}
