package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			switch (ch) {
			case 'i':
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
				break;

			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String manufactureDate = sc.nextLine();
				products.add(new UsedProduct(name, price, LocalDate.parse(manufactureDate, fmt1)));
				break;

			case 'c':
				products.add(new Product(name, price));
				break;

			default:
				System.out.println("Invalid type! Adding as common product.");
				products.add(new Product(name, price));
				break;
			}

		}

		System.out.println("PRICE TAGS:");
		for (Product p : products) {
			System.out.println(p.priceTag());

		}

		sc.close();

	}
}