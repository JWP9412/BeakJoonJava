package String;

import java.util.Scanner;

public class Q2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		StringBuffer sba =new StringBuffer(a);
		StringBuffer sbb =new StringBuffer(b);
		
		String geta = sba.reverse().toString(); //문자열 뒤집기
		String getb = sbb.reverse().toString(); //문자열 뒤집기

		int A = Integer.parseInt(geta);
		int B = Integer.parseInt(getb);
		
		if(A<B) {A=B;}
		System.out.println(A);
		
		/*
		char[] arr = a.toCharArray();
		char[] reversedArr = new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			reversedArr[arr.length-1-i] = arr[i];
		}
		String reverseda = new String(reversedArr);
		System.out.println("reverseda : "+reverseda);
		*/

	}

}
