package application;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Account account;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		sc.nextLine();
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number,holder,initialDeposit);
			}
		else {
			account = new Account(number,holder);
		}
		System.out.println();
		System.out.println("updated account data: ");
		System.out.println(account);
		System.out.println("Enter the deposit value: ");
		double amountd = sc.nextDouble();
		account.deposit(amountd);
		System.out.println("Updated data: ");
		System.out.println(account);
		System.out.println();
		System.out.println("enter the withdraw value: ");
		double amountw = sc.nextDouble();
		account.withdraw(amountw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
	}

}
