package For;
//X보다 작은수
import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		for(int cnt=0; cnt<N;cnt++) {
			int get = sc.nextInt();
			if(get<X) {
				System.out.println(get);
			}
		}

	}

}
