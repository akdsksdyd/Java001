package day08.static_.basic;

import java.util.Arrays;

public class PrintArray {
	/*
	Arrays.toString() 의 기능을 따라하기


	PrintArray클래스
	1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
	2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
	2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
	 */
	private PrintArray() {} //객체 생성불가
	
	
	public static String toArray(int[] a) {
		String result = "[";
		for(int i = 0; i < a.length; i++) {
			result += a[i];
			if(i == a.length-1) {
				result += "]";
				break;
			}
			result += ", ";
			
		}
		return result;
	}
	public static String toArray(char[]a) {
		String result = "[";
		for(int i = 0; i < a.length; i++) {
			result += a[i];
			if(i == a.length-1) {
				result += "]";
				break;
			}
			result += ", ";
		}
		return result;
	}
	public static String toArray(String[]a) {
		String result = "[";
		for(int i = 0; i < a.length; i++) {
			result += a[i];
			if(i ==a.length-1) {
				result += "]";
				break;
			}
			result += ", ";
		}
		return result;
	}
}
