package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d04 = LocalDate.parse("2023-03-13");
		LocalDateTime d05 = LocalDateTime.parse("2023-03-13T06:48:50");
		Instant d06 = Instant.parse("2023-03-13T06:50:50Z");
		
		//A data de d04 menos 7 dias passado no parametro
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println(pastWeekLocalDate);
		
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println(nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		System.out.println(pastWeekLocalDateTime);
		
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println(nextWeekLocalDateTime);
		
		//o instant usar as horas para calcular
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println(pastWeekInstant);
		
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println(nextWeekInstant);
		
		//duração entre datas
		Duration d1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("d1 em dias = "+ d1.toDays());
		
		//para poder saber o tempo decorrido entre dois LocalDates temos que converter
		//para LocalDateTime
		Duration d2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0,0));
		System.out.println("d2 em dias = "+ d2.toDays());
		
		Duration d3 = Duration.between(pastWeekInstant, d06);
		System.out.println("d3 em dias = "+ d2.toDays());
		
	}

}
