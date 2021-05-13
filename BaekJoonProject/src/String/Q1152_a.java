package String;

import java.util.Scanner;
public class Q1152_a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		sc.close();
		int c=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c++;
			}
		}System.out.println(c);
	}
}
