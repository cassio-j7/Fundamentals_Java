package formatação;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2023-05-10");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-10T01:30:52");
		Instant d03 = Instant.parse("2023-05-10T01:30:52Z");
		
		//Formatação customizada
		//Para formatar datas, usamos a classe DateTimeFormatter
		//Podemos montar o padrão de vizualizaão da data. Ex: mm/yyyy ou dd/mm
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(d01.format(fmt1));
		System.out.println(d02.format(fmt2));
		
		//o Instant não tem método format normal. Temos que especificar o fuso-horario
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//neste caso, usando o fuso-horario da máquina 
		
		System.out.println(fmt3.format(d03));
		
		//	Podemos utitizar a documentação tambem para usar outras formatações
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println(d02.format(fmt4));
		
	}

}
