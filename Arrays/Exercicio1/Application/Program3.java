/***************************************************************
 * Fazer um programa para ler nome, idade e altura de N pessoas, 
 * conforme exemplo. Depois, mostrar na tela: 
 * 	- Altura media do grupo;
 *	- Idade media do grupo;
 *	- Menores de idade(quantidade, percentual e nomes);
 *	- Mais velho;
 *	- Maior altura;
 *	- Menor altura;
 *	- Quantidade de homens;
 *	- Quantidade de mulheres;
 ***************************************************************/

package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people does the group have?");
		int n = sc.nextInt();
		
		Person[] person = new Person[n];
		
		
		for(int i = 0; i < person.length; i++) {
			System.out.println("Register person #" + (i+1) );
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			System.out.print("Gender: ");
			char gender = sc.next().charAt(0);
			
			person[i] = new Person(name, age, height, gender);
		}
		System.out.println();
		System.out.println("===================================");
		
		System.out.println("List peaple: ");
		for(Person x : person) {
			System.out.println(x.toString());
		}
		System.out.println();
		System.out.println("===================================");
		
		System.out.println("INFORMATION OF GROUP");
		
		double add = 0.0;
		for(int i = 0; i < person.length; i++) {
			add += person[i].getHeight();
		}
		double averageHeight = add / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", averageHeight);
		System.out.println();
		System.out.println("===================================");
		
		add = 0.0;
		for(int i = 0; i < person.length; i++) {
			add += person[i].getAge();
		}
		double averageAge = add / n;
		System.out.printf("AVERAGE AGE: %.2f%n", averageAge);
		System.out.println();
		System.out.println("===================================");
		
		System.out.println("MINORS: ");
		int cont = 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getAge() < 18) {
				cont++;
			}
		}
		System.out.println("Quantity: " + cont);
		double percentage = ((double)cont/person.length) * 100.00;
		System.out.printf("Percentage: %.2f%%", percentage);
		System.out.println();
		System.out.println("===================================");
		
		System.out.print("OLDEST: ");
		int old = 0;
		int pos = 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getAge() > old) {
			old = person[i].getAge();
			pos = i;
			}
		}
		System.out.println(person[pos].toString());
		System.out.println();
		System.out.println("===================================");
		
		System.out.print("BIGGER: ");
		double big = 0.0;
		pos = 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getHeight() > big) {
			big = person[i].getHeight();
			pos = i;
			}
		}
		System.out.println(person[pos].toString());
		System.out.println();
		System.out.println("===================================");
		
		System.out.print("SMALLERR: ");
		double small = person[0].getHeight();
		pos= 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getHeight() < small) {
			small = person[i].getHeight();
			pos = i;
			}
		}
		System.out.println(person[pos].toString());
		System.out.println();
		System.out.println("===================================");
		
		System.out.println("TOTAL GROUP:");
		int man = 0;
		int wom = 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getGender() == 'M') {
				man++;
			}
			else{
				wom++;
			}
		}
		System.out.println("MEN: " + man);
		System.out.println("WOMEN: " + wom);
		
		sc.close();
	}
	
		
}
