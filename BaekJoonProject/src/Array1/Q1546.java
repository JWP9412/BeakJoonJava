package Array1;
//ЦђБе
import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		double max = 0;
		double sum = 0;
		double arr[] = new double[in];
		double sarr[] = new double[in];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}for(int j=0;j<arr.length;j++) {
			sarr[j] = arr[j]/max*100;
			sum += sarr[j];
			}
		System.out.println(sum/in);
	}

}
