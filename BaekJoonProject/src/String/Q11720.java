package String;
//t += h.charAt(i)-'0'; //charAt()은 아스키코드 값을 반환 하므로 -48 또는 -'0' 을 해주어야 한다
import java.util.Scanner;
public class Q11720 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int g = s.nextInt();
		String h = s.next();
		int t = 0;
		for(int i=0;i<g;i++) {
			t += h.charAt(i)-'0';
		}
		System.out.println(t);
	}
}
