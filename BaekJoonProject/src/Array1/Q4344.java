package Array1;

import java.util.Scanner;

public class Q4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			long sm = 0;
			int l = sc.nextInt();
			long arr[] = new long[l];
			for(int x=0;x<l;x++) {
				arr[x]=sc.nextLong();
				sm += arr[x];
				
			}
			long r = sm/l;
			int cnt = 0;
			double avr =0;
			for(int y=0;y<l;y++) {
				if(arr[y]>r) {
					++cnt;
					
				}avr = (double)cnt/l *100;
				
				
			}
			System.out.println(String.format("%.3f", ((double)Math.round(avr*1000))/1000 )+"%");
			n--;
		}

	}

}
