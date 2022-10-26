package naver.lljaewon33.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {

	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스 3개 생성
		
		Set<String> treeSet = new TreeSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		//샘플 데이터 삽입
		// 숫자 < 영문 대문자 < 소문자 < 한글 순서
		treeSet.add("A");
		treeSet.add("1");
		treeSet.add("A");
		treeSet.add("가");
		treeSet.add("a");
		treeSet.add("a");
		
		linkedHashSet.add("AB");
		linkedHashSet.add("4ABA");
		linkedHashSet.add("ABA");
		linkedHashSet.add("A4a");
		//데이터 출력
		for(String first : treeSet) {
			System.out.print(first + "\t");
		}
		System.out.println();
		for(String non : linkedHashSet) {
			System.out.print(non + "\t");
		}
		
	}
}
