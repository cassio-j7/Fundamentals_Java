package calculos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d01 = LocalDate.parse("2023-05-10");
		LocalDateTime d02 = LocalDateTime.parse("2023-05-10T01:30:52");
		Instant d03 = Instant.parse("2023-05-10T01:30:52Z");
		
		System.out.println("===============(3 DIAS)==================");
		
		
		//USANDO LOCALDATE
		//Suponhamos que queria saber a data de 3 dias antes da data atual
		LocalDate pastDay = d01.minusDays(3);
		System.out.println("Data de 3 dias antes: " + pastDay);
		
		//Suponhamos que queira saber a data de 3 dias depois da data atual
		LocalDate nextDay = d01.plusDays(3);
		System.out.println("data de 3 dais depois" + nextDay);
		
		System.out.println("===============(2 SEMANAS)==================");
		
		//Suponhamos que queria saber a data de 2 semanas antes da data atual
		LocalDate pastWeek = d01.minusWeeks(2);
	    System.out.println("Data de 2 semanas antes: " + pastWeek);
				
		//Suponhamos que queira saber a data de 2 semanas depois da data atual
		LocalDate nextWeek = d01.plusWeeks(2);
		System.out.println("data de 2 semanas depois" + nextWeek);
				
		System.out.println("================(4 MESES)=================");
				
		//Suponhamos que queria saber a data de 4 meses antes da data atual
		LocalDate pastMonth = d01.minusMonths(4);
		System.out.println("Data de 4 meses antes: " + pastMonth);
				
		//Suponhamos que queira saber a data de 4 meses depois da data atual
		LocalDate nextMonth = d01.plusMonths(4);
		System.out.println("data de 4 meses depois" + nextMonth);
		
		System.out.println("================(10 ANOS)=================");
		
		//Suponhamos que queria saber a data de 10 anos antes da data atual
		LocalDate pastYear = d01.minusYears(10);
		System.out.println("Data de 10 anos antes: " + pastYear);
						
		//Suponhamos que queira saber a data de 10 anos depois da data atual
		LocalDate nextYear = d01.plusYears(10);
		System.out.println("data de 10 anos depois" + nextYear);
		
		
		System.out.println("##############################################################");
		
		//USANDO INSTANT
		
		Instant pastDayInstant = d03.minus(2, ChronoUnit.DAYS);
		System.out.println("2 dias antes: " + pastDayInstant);
		
		Instant nextDayInstant = d03.plus(2, ChronoUnit.DAYS);
		System.out.println("2 dias depois: " + nextDayInstant);
		
		//DURAÇÃO DE TEMPO ENTRE DUAS DATAS
		
		//Usamos a clase Duration
		
		Duration t1 = Duration.between(pastDayInstant, nextDayInstant);
		System.out.println("A duração em dias entre das datas é: " + t1.toDays());
		System.out.println("A duração em horas entre das datas é: " + t1.toHours());
		System.out.println("A duração em minutos entre das datas é: " + t1.toMinutes());
		
		//OBS: NÃO DÁ PARA SABER A DURAÇÃO DE TEMPO ENTRE DUAS VARIAVEIS (LocalDate) precisamos converter para LocalDateTime
		Duration t2 = Duration.between(pastDay.atStartOfDay(), nextDay.atStartOfDay());
		System.out.println("A duração em dias entre das datas é: " + t2.toDays());
	}

}
