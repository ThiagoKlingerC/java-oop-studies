package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Employee> list = new ArrayList<>();
		for(int i=1 ; i<=n ; i++) {
			System.out.println("Employee #" +i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			sc.nextLine();
			
			list.add(new Employee(id, name, salary));
		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist!");	
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
			
		}
		
		System.out.println("");
		System.out.println("List of employees: ");
		
		for(Employee emp: list) {
			System.out.println(emp);
		}
		sc.close();
	}
	
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
