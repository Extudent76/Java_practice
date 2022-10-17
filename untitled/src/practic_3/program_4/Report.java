package practic_3.program_4;
import java.util.Scanner;
public class Report {
	 Employee[] employees;
	public Report() {
		System.out.println("Введите количество сотрудников:");
		Scanner scan = new Scanner(System.in);
		employees = new Employee[scan.nextInt()];
		System.out.println("Введите информацию о сотрудниках (имя и зарплату):");
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee(scan.next(), scan.nextDouble());
		}
	}
	public void generateReport() {
		System.out.println("===============================ОТЧЁТ============================");
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("%-32s%32.2f%n", employees[i].getFullName(), employees[i].getSalary());
		}
		System.out.println("================================================================");
	}
}
