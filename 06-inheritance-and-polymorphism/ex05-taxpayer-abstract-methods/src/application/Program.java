package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = sc.nextInt();
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		for (int i=0 ; i<numberOfTaxPayers ; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:" );
			System.out.print("Individual or company (i/c)?");
			char chr = sc.next().charAt(0);
			System.out.print("name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income");
			double anualIncome = sc.nextDouble();
			
			switch (chr) {
			
				case 'i':
					System.out.print("Health expenditures:");
					double helthExpenditures = sc.nextDouble();
					taxPayers.add(new Individual(name, anualIncome, helthExpenditures));
					break;
				
				case 'c':
					System.out.print("Number of employees: ");
					int numberOfEmployees = sc.nextInt();
					taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
					break;
			}
			
		}
		
		System.out.println("TAXES PAID:");
		double sum =0;
		for(TaxPayer t: taxPayers) {
			System.out.println(t.getName() +": $ " + String.format("%.2f",t.tax()));
			sum += t.tax();
		}
		System.out.println("TOTAL TAXES: $ " +String.format("%.2f",sum));
		sc.close();
	}
}
