package naver.lljaewon33.multithread;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		//2개씩 실행할 수 잇는 세마포어
		Semaphore semaphore = new Semaphore(1);
		
		Thread th1 = new Thread(new SemaphoreThread("재원1", semaphore));
		Thread th2 = new Thread(new SemaphoreThread("재원2", semaphore));
		Thread th3 = new Thread(new SemaphoreThread("재원3", semaphore));
		Thread th4 = new Thread(new SemaphoreThread("재원4", semaphore));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
