/*
 * 이와 같이 나열된 분수들을 
 * 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 
 * 지그재그 순서로 차례대로 
 * 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */
package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) throws IOException{
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		//Scanner s = new Scanner(System.in);
		int x = 1;
		int y = 1;
		int c =0;
		int g = Integer.parseInt(s.readLine());
		//int g = s.nextInt();
		boolean run = true;
		while(run) {
			int i = x;
			for(y=1;y<=x;y++) {
				c++;
				if(c==g) {
					System.out.println(i+"/"+y);
					run = false;
				}
				i--;
			}
			x++;
		}
	}
}
