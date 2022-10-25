package day09.inter.basic2;

public class Basic implements BasicInter{
	//클래스가 가져야 할 메서드를 interface에 정의
	@Override
	public int delete(int a) {
		System.out.println("delete.......");
		return a;
	}@Override
	public String getInfo() {
		System.out.println("getInfo......");
		return "getInfo";
	}@Override
	public void info() {
		System.out.println("info......");
	}@Override
	public void insert(int a) {
		System.out.println("info......");
	}




}
