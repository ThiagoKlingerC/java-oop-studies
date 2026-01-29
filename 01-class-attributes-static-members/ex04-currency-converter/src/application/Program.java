package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dolarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought?");
		double quantity = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.totalPaid(dolarPrice, quantity));
		sc.close();
	}
}
