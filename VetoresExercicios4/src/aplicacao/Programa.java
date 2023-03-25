/**************************************************************************
 * A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos numeros 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia um quantidade N representando o numero de estudantes que vão alugar
os quartos (N pode se de 1 a 10). Em seguida, registre o aluguel dos N
estudantes. Parad cada registro de aluguel, informar o nome e o email do
estudante, bem como qual dos quartos ele escolheu (0 a 9). Suponha que 
seja escolhido um quarto vago. Ao final, seu programa deve imprimir um 
relatorio de todas as ocupações de pensionados, por ordem de quarto.

 *************************************************************************/
package aplicacao;

import java.util.Scanner;
import entidade.Cliente;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Cliente[] cadastro = new Cliente[10];
		
		System.out.print("Quantos quartos quer alugar?");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #"+ i +":");
			System.out.print("Nome: " );
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Qual numero o quarto: ");
			int numQuarto = sc.nextInt();
			
			cadastro[numQuarto] = new Cliente(nome, email);
		}
		
		System.out.println("Quartos alugados: ");
			for(int i = 0; i < 10; i++) {
				if ( cadastro[i] != null) {
					System.out.println(i +":"+ cadastro[i]);
				}
			}
		
		
		sc.close();
	}

}
