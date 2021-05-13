package String;

import java.util.Scanner;

public class Q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int cnt[] = new int[26];
		int max = 0;
		char re = '?';
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i) - 'A']++;
			if (max < cnt[str.charAt(i) - 'A']) {
				max = cnt[str.charAt(i) - 'A'];
				re = str.charAt(i);
			} else if (max == cnt[str.charAt(i) - 'A']) {
				re = '?';
			}
		}
		System.out.println(re);
	}
}
