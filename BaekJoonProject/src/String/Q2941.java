package String;

import java.util.Scanner;

public class Q2941 extends StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String get = sc.next();
		// String get = "ljes=njak";// sc.next();
		String cro[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		System.out.println("cro.length : " + cro.length);
		String arr[] = new String[get.length() - 1];
		String newget = get;
		int cnt = 0;
		for (int i = 0; i < get.length(); i++) {
			if (i + 2 <= get.length()) {
				arr[i] = get.substring(i, i + 2);
				System.out.println("arr[" + i + "] : (" + arr[i] + ")");
			}
			for (int k = 0; k < cro.length; k++) {
				if (i < get.length() - 1) {
					// arr[i] = get.substring(i, i + 2);
					// System.out.println("arr["+i+"]"+arr[i]);
					if (arr[i].equals(cro[k])) {
						get = get.replace(cro[k], "  ");
						newget = get.trim();
						cnt++;
						System.out.println("!! get : |" + get + "|");

						System.out.println("@ arr[" + i + "] == cro[" + k + "] : (" + arr[i] + ")");
						// System.out.println("cro[k] : " + cro[k]);
						System.out.println("cnt : " + cnt);

					}
				}
			}

		}
		get = get.replace(" ", "");
		System.out.println("@@ get : |" + get + "|");
		System.out.println(get.length() + cnt);
	}

}
