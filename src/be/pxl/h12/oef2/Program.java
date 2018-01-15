package be.pxl.h12.oef2;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Integer[] table = new Integer[Integer.parseInt(args[0])];

		Random rdm = new Random();

		if (Integer.parseInt(args[1]) < Integer.parseInt(args[2])) {
			for (int i = 0; i < table.length; i++) {
				table[i] = (rdm.nextInt(Integer.parseInt(args[2])) + Integer.parseInt(args[1]));
			}
		}
		int gemiddelde = 0;
		for (Integer integer : table) {
			System.out.println(integer.intValue());
			gemiddelde += integer.intValue();
		}
		gemiddelde /= table.length;
		System.out.println("Het gemiddelde is "+gemiddelde);
	}

}
