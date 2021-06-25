package Math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Q2869 {

	public static void main(String[] args) throws Exception {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(s.readLine());
		int B = Integer.parseInt(s.readLine());
		int V = Integer.parseInt(s.readLine());
		double a = Math.ceil((V-B)/(A-B));
		System.out.println((int)a);
	}
}

/*
Scanner s = new Scanner(System.in);
double A = s.nextDouble();
double B = s.nextDouble();
double V = s.nextDouble();*/

/*
double A = Double.parseDouble(s.readLine());
double B = Double.parseDouble(s.readLine());
double V = Double.parseDouble(s.readLine());
double a = Math.ceil((V-B)/(A-B));
System.out.println((int)a); */
