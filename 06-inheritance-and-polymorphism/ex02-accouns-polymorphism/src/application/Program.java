package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		List<Account> accounts = new ArrayList<>();
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		
		acc1.withdraw(200.0);
		acc2.withdraw(200.0);
		acc3.withdraw(200.0);
		
		for (Account c: accounts) {
			System.out.println(c.getBalance());
			
		}
		
	}
}