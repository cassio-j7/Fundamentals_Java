/*************************************************************************
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como 
 * as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações 
 * deve ser armazenada em um vetor. Depois, imprimiros nomes dos alunos aprovados, 
 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis)
 
 */
package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Estudante;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas alunos quer analisar?");
		int num = sc.nextInt();
		
		Estudante[] estudante = new Estudante[num];
		
		for(int i = 0; i < num; i++) {
			sc.nextLine();
			System.out.println("Infomre o nome do estudante e suas notas:");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			estudante[i] = new Estudante(nome, nota1, nota2);
		}
		
		System.out.println("Aprovados: ");
		for(int i = 0; i < num; i++) {
			if (estudante[i].getNota1() + estudante[i].getNota2() > 60) {
				System.out.println(estudante[i].getNome());
			}
		}
		
		
		
		
		sc.close();
	}

}
