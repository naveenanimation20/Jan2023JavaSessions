package DateConcept;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataTest {

	public static void main(String[] args) {
		
		
		int i = LocalDate.now().getDayOfMonth();
		System.out.println(i);
		
		System.out.println(java.time.LocalDate.now());
		
		System.out.println(java.time.LocalDate.now().getDayOfMonth());
		System.out.println(java.time.LocalDate.now().getDayOfYear());
		System.out.println(java.time.LocalDate.now().getYear());

		System.out.println(java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/YYYY")));
		System.out.println(java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));

		
		System.out.println(java.time.LocalDate.now().minusDays(10));
		System.out.println(java.time.LocalDate.now().lengthOfMonth());
		System.out.println(java.time.LocalDate.now().minusMonths(2));
		System.out.println(java.time.LocalDate.now().plusMonths(6));
		
		
		
		System.out.println(java.time.LocalTime.now());

		System.out.println(java.time.LocalDateTime.now());

		
		
		
		
		
	}

}
