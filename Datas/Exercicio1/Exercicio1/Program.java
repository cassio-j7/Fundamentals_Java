/****************************************************************
 * Escreva um programa Java console que mostre a data atual no formato 
 * dd/MM/yyyy, ou seja, algo parecido com 23/05/2018.
 ***************************************************************/

package Exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d = LocalDate.now();
		
		System.out.println(fmt.format(d));
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("End program");
		sc.close();
	}

}
