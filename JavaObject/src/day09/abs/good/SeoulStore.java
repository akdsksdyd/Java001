package day09.abs.good;

public class SeoulStore extends Store{//추상클래스 상속
	
	@Override
	public void apple() {
		System.out.println("서울지점 사과는 500원");
	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론은 600원");
	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지는 700원");
	}
	

	
}
