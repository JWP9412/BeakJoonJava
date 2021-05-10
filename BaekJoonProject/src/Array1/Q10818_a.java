package Array1;

import java.util.Scanner;

public class Q10818_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]	= new int[sc.nextInt()];
		int min = 0;
		int max = 0;
		for(int i = 0; i<array.length;i++) {
			array[i]= sc.nextInt();
			min = array[0];
			if(max<array[i]) {
				max = array[i];
			}
			if(min>array[i]) {
				min = array[i];
			}
		}System.out.printf("%d %d",min,max);

	}

}
