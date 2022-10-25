package api.lang.system;

public class SystemEx {

	public static void main(String[] args) {
		
		System.out.println("출력");
		//System.exit(0);
		//System.gc();
		
		long start = System.currentTimeMillis(); // 1970/1/1 이후의 현재까지의 지나 온 시간을 밀리초로 변환
		
		//System.out.println(start);
		
		long sum = 0;
		for(long i = 1; i<= 10000000000L; i++) {
			sum+=i;
		}
		
		long end = System.currentTimeMillis(); // 1970/1/1 이후의 현재까지의 지나 온 시간을 밀리초로 변환
		//System.out.println(end);
		System.out.println((end-start)*0.001 + "초 소요됨");
		
		
		
		
		
		
		
		
		
	}
}
