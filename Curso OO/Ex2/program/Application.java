package program;

import java.util.Scanner;

import entities.Employee;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println("Employee: "+employee.name+", $ "+employee.NetSalary());
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		System.out.println("up data: "+employee);
		sc.close();
	}

}
