package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class FuncaoCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2023-03-14T09:51:25Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 +cal.get(Calendar.MONTH);
		/*
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		*/
		
		System.out.println("Minutos: "+minutos);
		System.out.println("Mes: "+mes);
		
		
	}

}
