package api.lang.object;

public class MainClass {

	public static void main(String[] args) {

		Person p = new Person("홍길동");
		//		boolean bool = p.equals("d");
		//		String result = p.toString();
		//		System.out.println(result);
		
		//toString()
		System.out.println(p.toString()); //반환 있음
		
		//equals()
		Person p2 = new Person("홍길동");
		System.out.println(p.equals(p2)); //f

		//clone() - 객체복사
		
		try {
			Object obj = p.clone();
			Person p3 = (Person)obj;
			
			System.out.println("복사된 객체: " + p3.getName());
			System.out.println(p3 == p);
			
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}








	}
}
