package Application4;

/******************************************************
 * Fazer um programa para ler os dados de um funcionário 
 * (nome, salario bruto e impostos). Em seguida, mostar os 
 * dados do funcionário(nome e salario líquido).Em seguida, 
 * aumentar o salario do funcionário com base numa porcentagem 
 * dada pelo usuário. Mostrar novamente os dados do funcionário. 
 * Use uma classe.
 *****************************************************/

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter the name of the employee: ");
		emp.name = sc.nextLine();
		System.out.println("Which your gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Wich tax value: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee data: " + emp.toString());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Update data: " + emp.toString());
		System.out.println();
		
		sc.close();
	}

}
