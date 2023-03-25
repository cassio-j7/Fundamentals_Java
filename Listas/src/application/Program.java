package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	List é o tipo da lista (interface)
			<Integer> é o tipo da lista (sempre usar wrapper classes
			list nome da lista
			instanciação = new ArrayList<>();
		*/
		
		List<String> list = new ArrayList<>();
		
		//list.add(obj) adicionar elementos a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		
		/* para adicionar elementos numa certa possição
		se usa uma variação o list.add que rece a posição 
		e depois o valor */
		list.add(2, "Marco");
		
		/*Para remover elementos da lista por comparação basta usar
		 * o comando list.remove();
		*/
		//list.remove("Anna");
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println();
	
		//Para saber o tamnho da lista, basta chamar o comando lis.size();
		System.out.println(list.size());
		
	
		System.out.println("------------------------------------------");
		/*remoção de elemento por meio de predicado o que chamamos de função 
		 * lambda. (->) significa tal que
		 */
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------");
		//Para encontar a posição do elemento na lista
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		System.out.println("Index of Bob: "+ list.indexOf("Marco"));
		
		
		System.out.println("-------------------------------------------");
		
		/*Para filtar a lista segundo um criterio
		 * Primeiro convertemos a lista para stream com list.stream
		 * depois convertemos par lista novamente com collectors.toList
		 */
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);
		}
		
		
		System.out.println("-------------------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
