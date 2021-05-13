package String;
//qudgjs1008´ÔÀÇ ¼ôÄÚµù
import java.util.Scanner;

public class Q10809_b {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=97;i<123;i++)
			System.out.print(s.indexOf((char)i)+" ");
	}

}
