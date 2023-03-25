/**************************************************************************
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme 
 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar 
 * também a porcentagem de pessoas com menos de 16 anos, bem como os nomes 
 * dessas pessoas caso houver.
 * 
 *************************************************************************/
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas pessoas quer registrar: ");
		int num = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[num];
		
		for(int i = 0; i < num; i++) {
			sc.nextLine();
			System.out.println("Informe o nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Informe a idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Informe a altura: ");
			double altura = sc.nextDouble();
			
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAltura = 0.0;
		for(int i = 0; i < num; i++) {
			somaAltura += pessoa[i].getAltura();
		}
		double mediaAltura = somaAltura / (double) num;
		System.out.printf("A media das alturas é: %.2f%n", mediaAltura);
		
		
		int cont = 0;
		for(int i = 0; i < num; i++) {
			if (pessoa[i].getIdade() <= 16) {
				cont++;
			}
		}
		double taxaMenorIdade =  ((double) cont / num) * 100.0;
		System.out.printf("A taxa de menores é: %.2f%n", taxaMenorIdade);
		
		System.out.println("Menores: ");
		for(int i = 0; i < num; i++) {
			if (pessoa[i].getIdade() <= 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
	sc.close();
	}

}
