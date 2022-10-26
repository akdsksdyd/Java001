package naver.lljaewon33.Set;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		//ArrayList 활용
		ArrayList<Integer> arr = new ArrayList<>();
		
		//ArrayList 의 size가 6보다 작을 떄 까지
		while(arr.size() < 6) {
			//1-45 까지의 숫자를 랜덤하게 추출
			int ran = r.nextInt(45)+1;
			//중복 검사를 해서 통과하면 add하고 통과하지 못하면 add수행 x
			if(arr.contains(ran)) {
				continue;
			}
			arr.add(ran);
		}
		//출력하기 전에 정렬 후 출력
		arr.sort(null);
		System.out.println(arr);
		
		Scanner scan = new Scanner(System.in);
		TreeSet<Integer> tree = new TreeSet<>();
		while(tree.size() < 6) {
			int ran = r.nextInt(45)+1;
			
			tree.add(ran);
		}
		
		
		
		System.out.println(tree);
		
		
		
	}
}
