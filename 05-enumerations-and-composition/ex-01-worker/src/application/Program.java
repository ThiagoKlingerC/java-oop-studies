package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter contract " + (i+1) + "# data:" );
			System.out.print("Date (DD/MM/YYYY): " );
			String data1 = sc.next();
			LocalDate contractData = LocalDate.parse(data1,fmt1);
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			HourContract contracts = new HourContract(contractData, valuePerHour, hours);
			
			worker.addContract(contracts);
		}
		
		
		System.out.println("");
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.print("Name: " 
				+ worker.getName()
				+ "\nDepartment: " 
				+ worker.getDepartment().getName()
				+ "\nIncome for " + monthAndYear +": " + String.format(".2f",worker.income(month, year)));
		
		sc.close();
	}
	
	
}
