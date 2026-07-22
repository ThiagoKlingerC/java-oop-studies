package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter a file path");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);

		String sourceFolderStr = sourceFile.getParent();
		File testeFolder = new File(sourceFolderStr + File.separator + "out");
		if(!testeFolder.exists()) {
		boolean sucess = new File(sourceFolderStr + File.separator + "out").mkdir();
		}
		
		String targetFileStr = sourceFolderStr + File.separator + "out" + File.separator + "summary.csv";

			try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

				String itemCsv = br.readLine();

				while (itemCsv != null) {
					String[] fildes = itemCsv.split(",");
					String name = fildes[0];
					Double price = Double.parseDouble(fildes[1]);
					Integer quantity = Integer.parseInt(fildes[2]);

					list.add(new Product(name, price, quantity));

					itemCsv = br.readLine();
				}

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

					for (Product item : list) {
						bw.write(item.getName() + "," + String.format("%.2f", item.totalPrice()));
						bw.newLine();
					}
					
					System.out.println(targetFileStr + "updated!");

				} catch (IOException e) {
					System.out.println("Error writing file: " + e.getMessage());
				}

			}

			catch (IOException e) {
				System.out.println("Error reading file: " + e.getMessage());
			}
			
			sc.close();
		}	
	}
