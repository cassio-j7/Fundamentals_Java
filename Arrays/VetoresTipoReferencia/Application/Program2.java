/********************************************************
 * Fazer um programa para ler um numero inteiro N e os 
 * dados (nome e preço) de N produtos. Armazene os N produtos
 * num vetor. Em seguida, mostre o preço médio dos produtos.
 * 
 * Manipulção de vetor de elementos tipo referencia (tipo classe).
 *******************************************************/

package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many products do you went write: ");
		int n = sc.nextInt();
		
		Product[] product = new Product[n];
		
		for(int i = 0; i < product.length; i++) {
			sc.nextLine();
			System.out.print("Enter name product: ");
			String name = sc.nextLine();
			System.out.print("Enter price product: ");
			double price = sc.nextDouble();
			
			product[i] = new Product(name, price);
		}
		System.out.println();
		System.out.println("============================");
		
		
		System.out.println("Product list: ");
		for(int i = 0; i < product.length; i++) {
			System.out.println(product[i].toString());
		}
		System.out.println();
		System.out.println("============================");
		
		System.out.println("Average price: ");
		double sum = 0.0;
		for(int i = 0; i < product.length; i++) {
			sum += product[i].getPrice();
		}
		double averagePrice = sum / product.length;
		System.out.printf("R$%.2f", averagePrice);
	
		sc.close();
	}

}
