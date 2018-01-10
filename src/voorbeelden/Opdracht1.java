package voorbeelden;

import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Geef waarde");
		String waarde = input.nextLine();
		
		Integer i = new Integer(waarde);
		i +=5;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i.byteValue());
	}

}
