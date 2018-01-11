package voorbeelden;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Geef uw naam in.");
		Instant start = Instant.now();
		String naam = input.nextLine();
		Instant stop = Instant.now();
		System.out.println(Duration.between(start, stop).toMillis()/(double)1000);
		System.out.println("Uw naam "+naam);
		input.close();
	}

}
