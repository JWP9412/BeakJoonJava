package String;

import java.util.Scanner;

public class Q10809_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char chAr[] = new char[str.length()];
		char setAr[] = new char[26];
		int setNum[] = new int[26];
		for (int k = 97; k <= 122; k++) {
			setAr[k - 97] = (char) k;
			setNum[k - 97] = -1;
			for (int i = 0; i < str.length(); i++) {
				chAr[i] = (char) str.charAt(i);
				if (setNum[k - 97] == -1) {
					if (chAr[i] == setAr[k - 97]) {
						setNum[k - 97] = i;

					}
				}
			}
			System.out.print(setNum[k - 97] + " ");
		}
	}

}
/*
 * ����
���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.

���
������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.

����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.

���� �Է� 1 
baekjoon

���� ��� 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
*/