package String;

import java.util.Scanner;

public class Q5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		int cnt = 0;
		while (l > 0) {
			char test = s.charAt(l-1);
			cnt += 2;
			if (test == 'A' || test == 'B' || test == 'C') {
				cnt += 1;
			} else if (test == 'D' || test == 'E' || test == 'F') {
				cnt += 2;
			} else if (test == 'G' || test == 'H' || test == 'I') {
				cnt += 3;
			} else if (test == 'J' || test == 'K' || test == 'L') {
				cnt += 4;
			} else if (test == 'M' || test == 'N' || test == 'O') {
				cnt += 5;
			} else if (test == 'P' || test == 'Q' || test == 'R' || test == 'S') {
				cnt += 6;
			} else if (test == 'T' || test == 'U' || test == 'V') {
				cnt += 7;
			} else if (test == 'W' || test == 'X' || test == 'Y' || test == 'Z') {
				cnt += 8;
			}
			
			l--;
		}
		System.out.println(cnt);
	}

}
