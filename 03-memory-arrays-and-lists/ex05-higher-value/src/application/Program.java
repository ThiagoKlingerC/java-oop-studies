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
		double[] vect = new double[n];
		for (int i=0 ; i<vect.length ; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double highestValue =vect[0];
		int highestPosition = 0;
		
		for (int i=1 ; i<vect.length ; i++) {
			if (vect[i] > highestValue) {
				highestValue = vect[i];
				highestPosition = i;
			}
		}
		System.out.println("");
		System.out.print("Highest value = " + highestValue + "\n");
		System.out.println("Highest value position = " + highestPosition);
		sc.close();
	}
}
