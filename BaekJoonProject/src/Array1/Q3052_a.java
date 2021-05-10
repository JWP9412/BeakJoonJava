package Array1;

import java.util.Scanner;

public class Q3052_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
			System.out.println("["+i+"] = " + arr[i] );
			
			}
		}

	}


