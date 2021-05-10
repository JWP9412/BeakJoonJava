package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[]	= new int[n];
		for(int i = 0; i<array.length;i++) {
			array[i]= sc.nextInt();
		}
		sc.close();
		Arrays.sort(array);
		System.out.printf("%d %d",array[0],array[n-1]);

	}

}
