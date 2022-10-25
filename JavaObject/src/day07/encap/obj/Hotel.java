package day07.encap.obj;

public class Hotel {//사용자 클래스
	private Chef chef; //= new Chef();     //객체도 변수 타입이 가능함.
	
	//기본 생성자
	public Hotel() {
	}
	
	//생성자 - 클래스를 받는 생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	//getter, setter
	public void setChef(Chef chef) {// = new Chef(); 
		this.chef = chef; 
	}
	public Chef getChef() {
		return chef; 
	}
}
