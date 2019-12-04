package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		aluno.aluno = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		if (aluno.media() < 60.0) {
			System.out.printf("FINAL GRADE = %.2f%n",aluno.media());
			System.out.println("FAIL");
			System.out.printf("MISSING POINTS= %.2f%n",aluno.missingPoints());
		}
		else {
			System.out.printf("FINAL GRADE = %.2f%n",aluno.media());
			System.out.println("PASS");
			
		}
		
	}

}
