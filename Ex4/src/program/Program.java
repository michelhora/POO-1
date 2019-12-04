package program;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.reais = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.dolar = sc.nextDouble();
		System.out.printf("Ammount to be paid in R$: %.2f%n",CurrencyConverter.dollarToReal());

	}

}
