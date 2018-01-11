package voorbeelden;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		Locale lokaal = Locale.getDefault();
		
		Scanner input = new Scanner(System.in);
		int weekdag = input.nextInt();
		
		DayOfWeek dag = DayOfWeek.of(weekdag);
		int plus = input.nextInt();
		
		dag = dag.plus(plus);
		
		System.out.println(dag.getDisplayName(TextStyle.FULL, lokaal));
		
		
		input.close();
	}

}
