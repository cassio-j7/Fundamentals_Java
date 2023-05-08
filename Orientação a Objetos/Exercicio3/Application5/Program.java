package Application5;

/****************************************************
 * Fazer um programa para ler o nome de um aluno e as 
 * três notas qeu ele obteve nos três trimestres do ano 
 * (primeiro trimestre vale 30 e o segndo e terceiro vale 
 * 35 cada). Ao final, mostar qual a nota final do aluno 
 * no ano. Dizer tambémse o aluno está arpovado (PASS) ou 
 * não (FAILED) e, em caso negativo, quantos pontos faltam 
 * para o aluno obter o mínimo para ser aprovado (60% da
 * nota). Criar uma classe Student para resolver o probelma.
 ***************************************************/

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the name of the student: ");
		student.name = sc.nextLine();
		System.out.println("First grade: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Thrid grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println("The final grade of the student " + student.name + " is " + student.finalGrade());
		System.out.println("SITUATION: ");
			if(student.finalGrade() < 60) {
				System.out.println("FAILED");
				System.out.printf("Missing %.2f pontis.%n", student.missingPoints());				
			}
			else {
				System.out.println("PASS");
			}
		
		
		System.out.println("End of program!");
		sc.close();
	}

}
