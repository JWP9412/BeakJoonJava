package For;
//º°Âï±â
import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String x = "";
		for(int b=0 ;b<a;b++) {
			int c = a-b-1;
			x += "*";
			System.out.print(" ".repeat(c));
			System.out.println(x);
		}

	}

}
