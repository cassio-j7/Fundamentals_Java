package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributor;
import entities.Personal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contributor> list = new ArrayList<Contributor>();
		
		System.out.print("Enter the number of Contibutors: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter the date #"+ i +" contributor");
			System.out.print("Personal or Company(p/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Annaul Income: ");
			double annualIncome = sc.nextDouble();
				
				if(ch == 'p') {
					System.out.println("Health Expenses: ");
					double healthExpenses = sc.nextDouble();
					list.add(new Personal(name, annualIncome, healthExpenses));
				}
				else {
					System.out.println("Number of the employees: ");
					int numberEmployee = sc.nextInt();
					list.add(new Company(name, annualIncome, numberEmployee));
				}
			}
		
			System.out.println();
			System.out.println("Taxes paid: ");
			for(Contributor contributor : list) {
				System.out.println( contributor.getName()+ "    R$ "+contributor.tax());
				//System.out.printf("%s: R$%.2f%n", contributor.getName(), contributor.tax());
				//System.out.println(contributor.getName());
				
			}
				
			
	sc.close();
	}

}
