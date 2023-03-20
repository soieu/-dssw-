package ch12.sec08;

import java.text.*;
import java.util.*;
import java.time.format.*;
import java.time.LocalDateTime;

public class DataExample {

	public static void main(String[] args) {
		Date now = new Date();
		String date1 = now.toString();
		System.out.println(date1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String date2 = sdf.format(now);
		System.out.println(date2);
	
		LocalDateTime now2 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(now2.format(dtf));
	}

}
