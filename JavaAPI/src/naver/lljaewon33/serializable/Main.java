package naver.lljaewon33.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	//try ~ resource 구문
	public static void main(String[] args) {
		try (//인스턴스 단위로 파일에 기록 할 수 있는 객체를 생성
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./multiobject.txt"));){
			
			//기록 할 인스턴스 생성
			//기록 할 인스턴스가 여러개라면, 하나의 List로 묶어준다.
			StudentDTO dto = new StudentDTO(1, "아담", new Date());
			StudentDTO dto2= new StudentDTO(2, "재원", new Date());
			ArrayList<StudentDTO> list = new ArrayList<>();
			list.add(dto);
			list.add(dto2);
			//기록
			oos.writeObject(list);
			//oos.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		try (//인스턴스 단위로 파일에 기록 할 수 있는 객체를 생성
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./multiobject.txt"));){
			
			//하나의 데이터 읽어오기
			ArrayList list = (ArrayList)ois.readObject();
			for( Object obj : list ) {
				System.out.println(obj);
			}
			//ois.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
