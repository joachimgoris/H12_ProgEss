package voorbeelden;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BigInteger bigInt = new BigInteger(input.nextLine());
		BigDecimal bigDec = new BigDecimal(bigInt);
		
		System.out.println(faculteit(bigInt));
		System.out.println(faculteit(bigDec));
		
		input.close();
	}
	
	public static BigInteger faculteit(BigInteger bigInt) {
		for (int i = bigInt.intValue()-1; i > 0; i--) {
			bigInt = bigInt.multiply(BigInteger.valueOf(i));
		}
		
		return bigInt;
		
	}
	
	public static BigDecimal faculteit(BigDecimal bigDec) {
		for (int i = bigDec.intValue()-1; i > 0; i--) {
			bigDec = bigDec.multiply(BigDecimal.valueOf(i));
		}
		
		return bigDec;
		
	}

}
