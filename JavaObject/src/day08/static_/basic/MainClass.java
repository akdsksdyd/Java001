package day08.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		//PrintArray pa = new PrintArray();
		int [] a = {1,2,3,4,5};
		char[] a1 = {'a','b','c'};
		String [] a2 = {"김김","진진","우우"};
		System.out.println(PrintArray.toArray(a));
		System.out.println(PrintArray.toArray(a1));
		System.out.println(PrintArray.toArray(a2));
		
	}
}

