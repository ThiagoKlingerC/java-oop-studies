package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers will you type?");
		int n = sc.nextInt();
		sc.nextLine();
		int [] vector = new int[n];
		for (int i=0; i<vector.length ; i++) {
			System.out.print("Type a number");
			vector[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("NEGATIVE NUMBERS: ");
		for(int num: vector) {
			if(num < 0) {
				System.out.println(num);
			}
		}
		sc.close();
	}
}
