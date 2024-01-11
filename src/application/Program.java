package application;

import java.text.SimpleDateFormat;
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
		SimpleDateFormat sdf = new SimpledateFormat("dd/MM/yyyy");
		
	
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
		
		System.out.print("How many contracts to this worker: ");
		int n = sc.nextInt();
		
		// PRA LER OS DADOS DO CONTRATO, CRIAR UM for. DENTRO DESSE for TENHO LER OS DADOS DO CONTRATO. 
		
		for (int i = 1; i<=n; i++) {
			                                   //Concatenar 
			System.out.println("Enter contract #" + i + " data: ");
			System.out.println("Date (DD/MM/YYYY): ");
			
		//LER UMA VARIÁVEL DO TIPO DATE. ATENCAO - PARA CRIAR UMA DATA NO FORMATO ACIMA, CRIAR UM SIMPLE DATE FORMATE.
			Date contractDate = sdf.parse(workerLevel); 
			
			
		}
		
		
		
		
		
		
		
		sc.close();
		
	}

}
