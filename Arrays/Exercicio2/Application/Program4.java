package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students write: ");
		int num = sc.nextInt();
		
		Student[] student = new Student[num];
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("Student name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Grade 1: ");
			double grade1 = sc.nextDouble();
			System.out.print("Grade 2: ");
			double grade2 = sc.nextDouble();
			System.out.print("Grade 3: ");
			double grade3 = sc.nextDouble();
			
			student[i] = new Student(name, grade1, grade2, grade3);
		}
		
		System.out.println("Students: ");
		for(Student x : student) {
		System.out.println(x);
		}
		System.out.println();
		System.out.println("==============================");
		
		System.out.println("APPROVEDS");
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}
		
		
		sc.close();
	}

}

