
package naver.lljaewon33.Map;

import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//HashMap 인스턴스 생성
		HashMap<String, Object> map = new HashMap<>();
		
		//Map에 데이터 저장 - put
		//동일한 Key에 데이터를 저장하면 이전 데이터가 삭제되고 수정됨
		map.put("name", "재원");
		map.put("age", 1);
		map.put("job", "student");
		map.put("name", "나");
		//Map에서 데이터 가져오기 get사용
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("job"));
		//존재하지 않는 key를 사용하면 자바는 null을 리턴
		map.remove("age");
		System.out.println(map.get("age"));
		
		//Map을 이용하면 key의 이름을 몰라도 모든 데이터를 접근하는 것이 가능
		//모든 key에 접근할 수 있는 Set을 가져오기
		Set<String> keys = map.keySet();
		//Set을 순회
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
	}
}
