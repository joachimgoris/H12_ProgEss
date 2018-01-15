package be.pxl.h12.oef1;

import java.util.Arrays;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		Object[] test = new Object[5];

		test[0] = new Character(args[0].charAt(0));
		test[1] = new Integer(args[1]);
		test[2] = new Long(args[2]);
		test[3] = new Float(args[3]);
		test[4] = new Double[4];

		Collections.shuffle(Arrays.asList(test));
		for (Object object : test) {
			System.out.println(object);
		}

		for (Object object : test) {
			if (object instanceof Character) {
				if (Character.isLetter(((Character) object).charValue()) == true) {
					if (Character.isUpperCase(((Character) object).charValue())) {
						System.out.println(((Character) object).charValue() + " is een hoofdletter");
					} else {
						System.out.println(((Character) object).charValue() + " is een kleine letter");
					}
				} else {
					System.out.println(((Character) object).charValue() + " is geen letter");
				}
			}

			if (object instanceof Integer || object instanceof Long) {
				if (object instanceof Integer) {

					if ((Integer) object > 0) {
						System.out.println(object + " is een integer en de afstand tot het grootste getal is "
								+ (Integer.MAX_VALUE - (Integer) object));
					}
					if ((Integer) object < 0) {
						System.out.println(object + " is een integer en de afstand tot het kleinste getal is "
								+ (Integer.MIN_VALUE - (Integer) object));
					}
				}

				else {
					if ((Long) object > 0) {
						System.out.println(object + " is een float en de afstand tot het grootste getal is "
								+ (Long.MAX_VALUE - (Long) object));
					}
					if ((Long) object < 0) {
						System.out.println(object + " is een float en de afstand tot het kleinste getal is "
								+ (Long.MIN_VALUE - (Long) object));
					}
				}
			}

			if (object instanceof Float || object instanceof Double) {
				if (object instanceof Float) {
					String str = "";
					str = object.toString().substring(0, object.toString().indexOf('.'));
					double v = Double.valueOf(str);
					str = object.toString().substring(object.toString().indexOf('.'));
					double n = Double.valueOf(str);
					System.out.println(object + " is een float en het aantal cijfers voor de komma " + v
							+ " en het aantal cijfers na de komma " + n);
				}
				if (object instanceof Double) {
					String str = "";
					str = object.toString().substring(0, object.toString().indexOf('.'));
					double v = Double.valueOf(str);
					str = object.toString().substring(object.toString().indexOf('.'));
					double n = Double.valueOf(str);
					System.out.println(object + " is een double en het aantal cijers voor de komma " + v
							+ " en het aantal cijfers na de komma " + n);
				}
			}

		}
	}

}
