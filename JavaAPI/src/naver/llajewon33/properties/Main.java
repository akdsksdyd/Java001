package naver.llajewon33.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		//Properties 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null 리턴
		System.out.println(properties.getProperty("name"));
		
		//properties에 property를 저장
		properties.setProperty("아담", "한국 최초의 사이버 가수");
		properties.setProperty("강진 축구", "한국 최초의 온라인 축구 게임");
		
		properties.setProperty("나", "이재원");
		
		//텍스트 파일로 저장
		//웹서버, 다른 서버와 통신, DB작업 할 때 무조건 예외처리 해야함.
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git에 연결 되어 있으면 workspace가 아니라
			//c 드라이브의 사용자 디렉토리 안에 자신의 계정 안에 git 디렉토리에 있음.
			properties.store(new FileOutputStream("./myproject.properties"), "텍스트로 저장");
			properties.storeToXML(new FileOutputStream("./myproject.xml"), "xml로 저장");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
