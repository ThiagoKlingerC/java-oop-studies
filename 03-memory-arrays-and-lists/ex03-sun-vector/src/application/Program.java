package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		sc.nextLine();
		double sum = 0;
		double[] vector = new double[n];
		for (int i=0 ; i<vector.length ; i++) {
			System.out.print("Type a number: ");
			vector[i] = sc.nextDouble();
			sc.nextLine();
			sum += vector[i];
		}
		System.out.println("");
		System.out.print("Values = ");
		for (double num: vector) {
			System.out.print(num + " ");
		}
		System.out.println("");
		System.out.printf("Sum = %.2f%n", sum);
		System.out.printf("Average = %.2f%n", sum/n);
		sc.close();
	}

}
