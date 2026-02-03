package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double minor = 0;
		System.out.print("How many people will be entered into the registry? ");
		int n = sc.nextInt();
		sc.nextLine();
		Person[] vect = new Person[n];
		for (int i=0 ; i<vect.length ; i++) {
			System.out.println("Person " + (i+1) +" data:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Person(name,age,height);
			sum += height;
		}
		for (int i=0 ; i<vect.length ; i++) {
			if (vect[i].getAge() < 16) {
				minor += 1;
			}	
		}
		System.out.println("");
		System.out.printf("Average height: %.2f%n", sum/n);
		System.out.print("Person under 16 years of age " + (minor/n)*100 + "%\n");
		for (int i=0 ; i<vect.length ; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}
}

