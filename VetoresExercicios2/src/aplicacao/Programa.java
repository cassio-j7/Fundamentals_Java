/*************************************************************************
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas 
 * respectivas idades. Os nomes devem ser armazenados em um vetor, e as 
 * idades em um outro vetor. Depois, mostrar na tela o nomeda pessoa mais 
 * velha.
 * 
 *************************************************************************/

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas quer digitar: ");
		int num = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[num];
		
		for (int i = 0; i < num; i++) {
			sc.nextLine();
			
			System.out.println("Informe o nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Informe a idade: ");
			int idade = sc.nextInt();
			
			pessoa[i] = new Pessoa(nome, idade);
		}
		
		int maior = 0;
		int posicaoMaior = 0;
		for(int i = 0; i < num; i++) {
			if ( pessoa[i].getIdade() > maior) {
				maior = pessoa[i].getIdade();
				posicaoMaior = i;
			}
		}
		System.out.println("Pessoa mais velha: "+ pessoa[posicaoMaior].getNome());
		
		
		sc.close();
	}

}
