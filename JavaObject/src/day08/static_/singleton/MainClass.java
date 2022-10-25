package day08.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		//System.out.println(Computer.a);
		//System.out.println(Computer.a);
		//System.out.println(Computer.a);
		//System.out.println(Computer.a);
		//Singleton s = new Singleton(); x (받는 클래스에서private처리 해서.)static이 없으면 계속 생성되기 때문에 힙 영역이 꽉차서 에러뜸.
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s == s2 && s2 == s3);
		
		//동일한 변수가 사용됨.
		s.site = "이순신";
		System.out.println(s.site);
		System.out.println(s2.site);
		System.out.println(s3.site);
		
	}
}
