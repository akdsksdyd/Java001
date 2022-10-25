package day09.inter.basic3;

public class Dog extends Animal implements IPet{// extends 랑 implements 받는 순서 틀리면 안됨.

	public void eat() {
		System.out.println("강아지는 사료를 먹어요");
	}
		public void play() {
			System.out.println("강아지는 방에서 놀아요");
		}
}
