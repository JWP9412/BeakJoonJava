package For;
// ±âÂï N
import java.util.Scanner;

public class Q2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int q = x;
		for(int y=1;y<=x;y++) {
			System.out.println(q--);
		}

	}

}
