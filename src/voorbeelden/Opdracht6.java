package voorbeelden;

import java.time.LocalDate;

public class Opdracht6 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1998, 12, 6);
		
		System.out.println(date.getDayOfYear()+" "+date.getDayOfWeek()+" "+date.isLeapYear());
	}

}
