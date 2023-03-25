package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantos funcionarios serão registrados?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Empregado #"+ (i+1)+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionario emp = new Funcionario(id, nome, salario);
			
			list.add(emp);
		}
		
		System.out.println("Qual funcionario terá o salario aumentado?");
		Integer idAumento = sc.nextInt();
		Integer proc = procuraId(list, idAumento);
			if (proc == null) {
				System.out.println("Esse id não existe");
			}
			else {
				System.out.println("Qual a porcentagem de aumento?");
				double porcentagem = sc.nextDouble();
				list.get(proc).aumentoSalario(porcentagem);
			}
			
			System.out.println();
			System.out.println("Lista de Funcionarios:");
			for(Funcionario emp: list) {
				System.out.println(emp);
			}
		
		
		
		
		
		
		sc.close();
	}
	
	public static Integer procuraId( List<Funcionario> list, int id) {
			for(int i = 0; i < list.size(); i++) {
					if ( list.get(i).getId() == id) {
						return i;
					}
			}
			return null;
	}

}
