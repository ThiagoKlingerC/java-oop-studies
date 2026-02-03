package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the square matrix.");
		int n = sc.nextInt();
		sc.nextLine();
		int count = 0;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("type the element at the position: " + (i + 1) + (j + 1));
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] < 0) {
					count += 1;
				}
			}
		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println("\nNegative numbers = " + count);

		sc.close();
	}

}
