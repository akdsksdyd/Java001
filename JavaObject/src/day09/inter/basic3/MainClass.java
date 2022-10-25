package day09.inter.basic3;

public class MainClass {

	public static void main(String[] args) {

		
		
		//Dog d = new Dog(); //eat, play 실행 가능
		//Animal d = new Dog();// eat만 실행 가능
		//IPet d = new Dog();//play만 실행 가능
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();

		//1. Animal 배열에 저장
		Animal[] arr = {baduk, nabi, hodol};
		for(Animal a : arr ){
			a.eat();
		}
		//2. 바둑이는 Animal이지만 생성된 클래스가 인터페이스 상속을 받고 있다면, 상호형변환이 된다.
		IPet i1 = (IPet)arr[0];
		IPet i2 = (IPet)nabi;
		IPet i3 = new GoldFish();
		IPet[] arr2 = {i1, i2, i3};
		for(IPet i : arr2) {
			i.play();
		}
		System.out.println("========================");
		PetHouse.method01(i1);
		PetHouse.method01(i2);
		PetHouse.method01(i3);
		PetHouse.method02(arr2);


	}

}
