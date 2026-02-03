package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements will each vector have? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vecta = new double[n];
		double[] vectb = new double[n];
		double[] sum = new double[n];
		System.out.println("Type the values ​​for vector A");
		for(int i=0 ; i<vecta.length ; i++) {
			System.out.print("Type a number: ");
			vecta[i] = sc.nextDouble();
		}
		System.out.println("Type the values ​​for vector B");
		for(int i=0 ; i<vectb.length ; i++) {
			System.out.print("Type a number: ");
			vectb[i] = sc.nextDouble();
		}
		System.out.println("Sum vector: ");
		for(int i=0 ; i<vectb.length ; i++) {
			sum[i] = vecta[i] + vectb[i];
			System.out.println(sum[i]);
		}
		
		sc.close();
	}
}
