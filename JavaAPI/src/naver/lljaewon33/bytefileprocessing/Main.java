package naver.lljaewon33.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			//기록 할 파일 만들기
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\자바 강의\\" + sdf.format(date) + ".txt", true);
			
			//기록 할 메시지 생성
			String msg = "ㅇㅁㅇ\n";
			//파일에 기록
			fos.write(msg.getBytes());
			//파일 닫기
		} catch (Exception e) {
			System.out.println("파일 기록 실패");
			System.out.println(e.getLocalizedMessage());
		}
		//알에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("./2022-10-27.txt");
			//읽어서 저장 할 바이트 배열 생성
			byte[] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용확인
			System.out.println(new String(b));
			
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
