package day07.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		//호텔 클래스 사용
		Hotel hotel = new Hotel();
		
		//hotel.setChef(new Chef()); 밑에꺼랑 동일한 식임
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		//getter
		Chef c = hotel.getChef();
		c.cooking();
		System.out.println(chef == c); //true
		
	}
}
