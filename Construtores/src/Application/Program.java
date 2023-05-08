package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		/*
		 * O construtor garante que todos os atributos serão inicializados, que não haverá nenhum 
		 * atributo sem dados(null). 
		 */
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Poduct data: " + product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Update data: " + product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Update data: " + product.toString());
		
		System.out.println("Program end");
		sc.close();

	}

}
