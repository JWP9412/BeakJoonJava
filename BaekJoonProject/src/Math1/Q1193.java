/*
 * �̿� ���� ������ �м����� 
 * 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� 
 * ������� ������ ���ʴ�� 
 * 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
 * X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
