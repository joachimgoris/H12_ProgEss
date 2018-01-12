package voorbeelden;

import java.time.LocalDate;
import java.time.Period;

public class Opdracht8 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate thenDate = LocalDate.of(1998, 12, 6);
		
		System.out.println(Period.between(now, thenDate));
	}

}
