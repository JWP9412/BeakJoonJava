package String;
//t += h.charAt(i)-'0'; //charAt()�� �ƽ�Ű�ڵ� ���� ��ȯ �ϹǷ� -48 �Ǵ� -'0' �� ���־�� �Ѵ�
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
