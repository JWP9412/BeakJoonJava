package String;

import java.util.Scanner;
public class Q2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		while(r>0) {
			int g = sc.nextInt();
			String s = sc.next();
			for(int i=0;i<s.length();i++) {
				String c = Character.toString(s.charAt(i));
				System.out.print(c.repeat(g));
			}
		--r;
		System.out.println();
		}
	}
}
