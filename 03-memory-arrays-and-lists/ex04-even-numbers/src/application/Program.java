package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How manny numbers will you type? ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] vect = new int[n];
		int evenTotal = 0;
		for (int i=0 ; i<vect.length ; i++) {
			System.out.print("Type a number ");
			vect[i] = sc.nextInt();
			sc.nextLine();
			if (vect[i]%2 ==0 ) {
				evenTotal +=1;
			}
		}
		System.out.println("");
		System.out.println("EVEN NUMBERS:");
		for (int num: vect) {
			if (num%2 ==0 ) {
				System.out.print(num + " ");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.print("Quantity of even numbers = " + evenTotal);
		sc.close();
	}
}
