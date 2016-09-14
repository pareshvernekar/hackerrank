package test.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumberFactorial {
	
	public BigInteger factorial(int n) {
		if (n == 0)
			return BigInteger.valueOf(1L);
		
		return BigInteger.valueOf(n).multiply(factorial(n-1));
	}

	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		BigNumberFactorial bigNumberFact = new BigNumberFactorial();
		System.out.println(bigNumberFact.factorial(n));
	}
}
