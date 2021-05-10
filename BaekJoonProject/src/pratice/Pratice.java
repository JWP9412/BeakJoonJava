package pratice;

public class Pratice {

	public static void main(String[] args) {
		System.out.println(String.format("%.3f", 123.1234));
		int x = 0;
		int arr[] = new int[4];
		for(int i=0;i<=3;i++) {
			arr[i] = i+1;
			System.out.printf("i[%d]\n",i);
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
		for(int i=0;i<=3;i++) {
			x += arr[i];
			System.out.println("x : "+x);
		}

	}

}
