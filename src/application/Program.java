package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

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
		
		//DECLARAR UMA VARIAVEL DO TIPO WORKER:
		
		Worker worker = new Worker(departmentName,WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
