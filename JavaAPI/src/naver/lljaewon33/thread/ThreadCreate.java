package naver.lljaewon33.thread;

//Thread 클래스로 부터 상속받는 클래스 생성
class ThreadEx extends Thread{
	@Override //자바 소스 코드에 추가하여 사용할 수 있는 메타데이터의 일종이다. 보통 @ 기호를 앞에 붙여서 사용
	//위의 어노테이션은 상위 클래스나 인터페이스에서 제공하는 메서드가 아닌 경우
	//에러를 발생시켜 주는 어노테이션
	public void run() {
		//스레드로 수행할 내용
		//1초마다 Thread 클래스라는 문장을 10번 출력
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread 클래스");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}
//Runnable 인터페이스를 구현한 클래스 생성
class RunnableImpl implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Runnable 클래스");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}

	}
}
public class ThreadCreate {

	public static void main(String[] args) {
		//Thread클래스로부터 상속받은 클래스를 이용해서 스레드를 생성하고 실행
		Thread th1 = new ThreadEx();
		//start를 호출하면 run메서드의 내용을 수행
		//run으로 실행하면 스레드로 실행하는게 아니라 프로세서로 실행됨.
		
		th1.start();

		//Runnable 인터페이스를 implements 클래스를 이용해서 스레드를 생성하고 실행 
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();

		//Runnable 인터페이스를 Anonymous클래스를 이용해서 사용
		Thread th3 = new Thread(new  Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous 활용");
					} catch (Exception e) {
						System.out.println(e.getLocalizedMessage());
					}
				}
			}
		});
		th3.start();

		//Runnable 인터페이스는 public void run 메서드 1개만 소유
		//람다를 이용해서 작성하는 것도 가능		
		Thread th4 = new Thread(() ->{
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("람다 활용");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		th4.start();
	}
}




