package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of ordered: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #"+i+" data: ");
			System.out.print("Common, used, imported (c, u, i): ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			
			if( type == 'c') {
				list.add(new Product(name, price));
			}
			
			else if (type == 'u') {
				System.out.println("Manufacturing date: (dd/mm/yyyy)");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			
			else {
				System.out.println("Customsfee: ");
				double customsfee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsfee));
			}
		}
		System.out.println();
		
		System.out.println("TAGS: ");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
	
		sc.close();
	}

}
