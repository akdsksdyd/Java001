package naver.lljaewon33.nestedclass;

public class Outer {

	//내포 클래스 - 다른 클래스 안에 만들어진 클래스
	class Inner{
		public int num; 
	}
	//내포 클래스 안에 static 멤버가 있으면 인스턴스 생성없이 사용 할 수 있도록 static을 추가
	class StaticInner{ //원래는 static 을 클래스 앞에 넣어야 하지만 자바17버전 부터는 자동으로 해줌
		public int num; 
		public static int share;
	}
	
	
	class LocalInner{//LocalInner를 메서드 안에서 사용하다가 다른 메서드에서 사용하고 싶을 때 일반 이너 클래스로 메서드 밖에서 생성하고, 다른 메서드에서 다시 사용
		public int num;
	}
	public void method() {
		//메서드 안에 만들어진 클래스 - LocalInner
		//메서드 안에서만 사용 가능한 클래스
		class LocalInner{
			public int num;
		}
	}
}
