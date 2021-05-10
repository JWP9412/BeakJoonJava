package Array1;
//lee960802 ´ÔÀÇ ¼ôÄÚµù
import java.util.Scanner;

public class Q8958_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			int sm = 0;
			int c = 0;
			String s = sc.next();
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'O')
					sm += ++c;
				else
					c = 0;
			}
			System.out.println(sm);
			n--;
		}
	}
}