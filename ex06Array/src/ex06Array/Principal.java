package ex06Array;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Quartos[] vect = new Quartos[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #"+ i + ", ");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room]= new Quartos(name,email);
			sc.nextLine();
		}
	
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i+" : "+vect[i]);
			}
			
		}

	}

}
