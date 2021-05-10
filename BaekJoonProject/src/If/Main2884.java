package pr;

import java.util.*;

public class Main2884 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a>0 && a<=23 && b>=45) {
			System.out.printf("%d %d",a,b-45);
		}else if(a>0 && a<=23 && b<45) {
			System.out.printf("%d %d",a-1,b+15);
		}else if(a==0 && b>=45) {
			System.out.printf("%d %d",a+23,b-45);
		}else {
			System.out.printf("%d %d",a+23,b+15);
		}

	}
}