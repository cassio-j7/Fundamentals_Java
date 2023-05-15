package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employee will be registered?");
		int n = sc.nextInt();
		
		List<Employee> listEmp = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + i));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			listEmp.add(emp);
		}
		
		 System.out.print("Enter the employee id that will have salary increase: ");
		 int idSalary = sc.nextInt();
		 Integer pos = positionId(listEmp, idSalary);
			 if(pos == null) {
				 System.out.println("This id does not exist!");
			 }
			 else {
				 System.out.println("Enter percentage increase: ");
				 double percent = sc.nextDouble();
				 listEmp.get(pos).increaseSalary(percent);
			 }
			 
		System.out.println("UPDATE EMPLOYEE: ");
			for(Employee x : listEmp) {
				System.out.println(x);
			}
			
			sc.close();
	}
	
	public static Integer positionId(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
