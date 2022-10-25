package day07.modi.member.pac1;

public class B {

	//A의 기능
	public B() {
		A a = new A();
		a.var1 = 1;
		a.var2 = 2;
		//		a.var3 = 3; //x -private

		a.method01();
		a.method02();
		//		a.method03();//x - private
	}
}
