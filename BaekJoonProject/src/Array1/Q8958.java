package Array1;

//OXÄûÁî
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrStringIn = new String[sc.nextInt()];
		
		for (int i = 0; i < arrStringIn.length; i++) {
			int sum =0;
			arrStringIn[i] = sc.next();
			StringTokenizer st = new StringTokenizer(arrStringIn[i], "X");
			int countToken = st.countTokens();
			
			for (int k = 0; k < countToken; k++) {
				String token = st.nextToken();
				int arrLength[] = new int[token.length()];
				
				for(int j =0;j<token.length();j++) {
					arrLength[j] = j+1;
					sum += arrLength[j];
				}
			}System.out.println(sum);
		}sc.close();
	}

}
