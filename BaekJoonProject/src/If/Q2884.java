package If;

import java.util.*;

public class Q2884 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		if (M < 45) {
			H--;
			M += 15;
			if (H < 0) {
				H = 23;
			}
			System.out.println(H+" "+M);
		}else {
			System.out.println(H+" "+ (M -45));
		}

	}
}