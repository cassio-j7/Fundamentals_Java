/*******************************************************
 * Fazer um programa para ler um numero inteiro N e altura
 * de N pessoas. Armazene as N alturas em um vetor. Depois
 * imprima na tela e média das altura. 
 * 
 * Manipulção de vetor de elementos tipo valor (tipo primitvo).
 ******************************************************/

package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many height do you went write?");
		int n = sc.nextInt();
		
		double[] heights = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Write height: ");
			heights[i] = sc.nextDouble();
		}
		
		System.out.println("Heights writers: ");
		for(int i = 0; i < n; i++) {
			System.out.println("Height " + (i + 1) + ": " + heights[i]);
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += heights[i];
		}
		
		double averageHeight = sum / n;
		
		
		System.out.printf("Average heights: %.2f%n", averageHeight);
		
		
		sc.close();
	}

}
