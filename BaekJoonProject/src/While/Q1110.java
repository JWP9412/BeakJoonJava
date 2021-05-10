package While;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ten = num / 10;
		int one = num % 10;
		int attach = 0;
		int cnt = 0;
		while(true) {
			cnt++;
			int sum = ten + one;
			if(sum < 10) {
				attach = one * 10 + sum;
				System.out.printf("ten [%d] one [%d] sum [%d] attach [%d]\n",ten,one,sum,attach);
			}else {
				sum -= 10;
				attach = one * 10 + sum;
				System.out.printf("ten [%d] one [%d] sum [%d] attach [%d]\n",ten,one,sum,attach);
			}
			ten = attach / 10;
			one = attach % 10;
			
			if(attach == num) {
				System.out.println("cnt : "+cnt);
				break;
			}
		}
	}

}
