package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		//PROGRAMA PRINCIPAL:
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		String hourcontract = sc.nextLine();
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
			Date contractDate = sdf.parse(sc.next()); 
			System.out.print("Value per hour");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duraton (hours): ");
			int hours = sc.nextInt();
			
		// ESTANCIA O CONTRATO:
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);					
	    // CHAMA O METODO:
			worker.addContract(contract); //PASSANDOO CONTRATO COMO METODO. 	
		}
		
		System.out.println();
		System.out.println("Enter month ande year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		//VARIAVEL MONTH                  (INFORMAR O INICIO E FIM.)
		int month = monthAndYear.substring(arg0, arg1);
		
		
		
		
		
		
		
		sc.close();
		
	}

}
