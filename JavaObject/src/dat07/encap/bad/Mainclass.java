package dat07.encap.bad;

public class Mainclass {

	public static void main(String[] args) {
		//변수를 public으로 만둘어두면, 잘못 된 값이 저장 될 수 있음.
		MyBirth me = new MyBirth();
		me.year = 2023;
		me.month = 13;
		me.day = 32;
		me.ssn = "아무값";
		
		me.info();
		}
}
