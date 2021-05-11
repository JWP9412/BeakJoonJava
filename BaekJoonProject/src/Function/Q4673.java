package Function;

// 셀프 넘버
public class Q4673 {

	public static void main(String[] args) {
		int x = 54321;
		int cnt = 0;
		int arr[];
		int res = 0;

		// System.out.println(n1);
		// System.out.println(n2);
		// System.out.println(n3);
		// System.out.println(n4);
		// System.out.println(n5);
		for (int i = 1; i <= 10000; i++) {
			++cnt;
			int n1 = cnt % 10; // 일의자리
			int n2 = cnt % 100 / 10;
			int n3 = cnt % 1000 / 100;
			int n4 = cnt % 10000 / 1000;
			int n5 = cnt % 100000 / 10000;
			if (cnt < 10) {
				for (int k = 1; k <= 10000; k++) {
					res = cnt + n1;
					n1 = res % 10;
					n2 = res % 100 / 10;
					n3 = res % 1000 / 100;
					n4 = res % 10000 / 1000;
					n5 = res % 100000 / 10000;
					res = res + n1 +n2+n3+n4+n5;
					System.out.println(res);
				}
			}
			// System.out.println(cnt);
			/*
			 * if(cnt<10) { res = res + n1 +n1; System.out.println("res : "+res); }else
			 * if(cnt>=10 && cnt<100) { res = n2 + n1; System.out.println("res : "+res); }
			 */

		}
	}

}
