package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//PROGRAMA PRINCIPAL:
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel= sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
