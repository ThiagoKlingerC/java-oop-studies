package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		Client client = new Client(name, email, LocalDate.parse(birthDate, fmt1));
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		String status = sc.nextLine();
		LocalDateTime moment = LocalDateTime.now();
		Order order = new Order(moment, OrderStatus.valueOf(status), client);
		
		
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0 ; n>i ; i++) {
			System.out.println("Enter #" + (i+1) +" itemdata:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			Double productPrice = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.print("Order moment: " + fmt2.format(moment) +"\n");
		System.out.print("Order status: " + order.getStatus() +"\n");
		System.out.print(client + "\n");
		System.out.println("Order Items:");
		System.out.println(order);
			
		sc.close();
	}

}
