import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		//Adicionar elementos
		list.add("Maria");
		list.add("Bob");
		list.add("Alex");
		list.add("Alfred");
		list.add("Marco");
		list.add("Zoro");
		list.add("Luffy");
		list.add("Sanji");
		
		//tamanho da lista
		System.out.println(list.size());
		
		//Adicionar elemento em posição específica
		list.add(2, "Drake");
		
		//remover elemento especifico da lista
		list.remove(2);//por indice
		list.remove("Maria");//por elemento
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("========================");
		
		//remoção com predicado(FUNÇÃO LAMBDA)
		list.removeIf(x -> x.charAt(0) == 'A');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("========================");
		
		//encontrar a posição de um elemento
		System.out.println("Index of Bob " + list.indexOf("Bob"));
		System.out.println("Index of Bob " + list.indexOf("Luffy"));
		System.out.println("Index of Bob " + list.indexOf("Sanji"));
		
		System.out.println("========================");
		
		//filtar a lista com base num argumento
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
	}

}
