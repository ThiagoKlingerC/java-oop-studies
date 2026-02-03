package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix.");
		int row = sc.nextInt();
		int column = sc.nextInt();
		int[][] mat = new int[row][column];
		System.out.println("");
		System.out.println("Enter the matrix data. ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		System.out.println("Enter the number to be analyzed. ");
		int number = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if ((mat[i][j] == number)) {
					System.out.println("Position: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][(j - 1)]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[(i - 1)][(j)]);
					}
					if (j < column - 1) {
						System.out.println("Right: " + mat[(i)][(j + 1)]);
					}
					if (i < row - 1) {

						System.out.println("Down: " + mat[(i + 1)][j]);
					}
				}
			}
		}
		sc.close();
	}
}
