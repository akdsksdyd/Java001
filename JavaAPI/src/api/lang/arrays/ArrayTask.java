package api.lang.arrays;

import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args) {
		//문자열 배열 생성
		String[] ar = {"카리나","아이린","윈터","조이","슬기"};
		
		//배열을 순회하면서 출력
		/*for(String singer : ar) {
			System.out.println(singer);
		}*/
		
		//문자열의 크기 비교 하는 메서드 : compareTo, compareToIgnorecase	
		//System.out.println(ar[1].compareTo(ar[0]));
		
		//선택 정렬
		//배열의 복제
		//첫번째 부터 n-1 번째 데이터 까지
		String[] copyAr = Arrays.copyOf(ar, ar.length);
		for(int i = 0; i < copyAr.length-1; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j < copyAr.length; j++) {
				//뒤에 있는 데이터가 더 크다면(작다면) 교환
				if(copyAr[i].compareTo(copyAr[j])<0) {
					String temp = copyAr[i];
					copyAr[i] = copyAr[j];
					copyAr[j] = temp;
				}
			}
		}
		for(String singer : copyAr) {
			System.out.println(singer);
		}
		System.out.println(Arrays.toString(copyAr));
		
		
		
		
		
		
		
		
		
		
	}
}
