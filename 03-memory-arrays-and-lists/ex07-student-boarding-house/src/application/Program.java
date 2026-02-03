package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Tenant;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?" );
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		System.out.println("");
		
		Tenant[] vectTenant = new Tenant[10]; // numbered rooms from 0 to 9
		
		for (int i=0 ; i<n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vectTenant[room] = new Tenant(name,email);
			System.out.println("");
			System.out.println("");
		}
		
		System.out.println("Busy rooms :");
		
		for(int i=0 ; i<vectTenant.length ; i++) {
			if (vectTenant[i] != null) {
				System.out.println(i+ ":" +" " + vectTenant[i].getNome() +  ", " + vectTenant[i].getEmail());
			}
		}
		sc.close();
	}
}
