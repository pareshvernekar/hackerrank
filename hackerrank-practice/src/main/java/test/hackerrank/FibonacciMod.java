package test.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/fibonacci-modified
 */
public class FibonacciMod {

	static BigInteger T1, T2;
	
	static BigInteger fibonacciMod(int t1, int t2, int n) {
		T1 = BigInteger.valueOf(t1);
		T2 = BigInteger.valueOf(t2);
		return fib(BigInteger.valueOf(n));
	}
	
	static BigInteger fib(BigInteger Tn) {
		
		if (Tn.compareTo(BigInteger.valueOf(1))==0) {
			return T1;
		} else if (Tn.compareTo(BigInteger.valueOf(2))==0) {
			return T2;
		}
		
		BigInteger $T2 = fib(Tn.subtract(BigInteger.valueOf(2)));
		BigInteger $T1 = Tn.subtract(BigInteger.valueOf(1));
		$T1=fib($T1);
		$T1=$T1.multiply($T1);
		return $T1.add($T2);
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int t1 = scanner.nextInt();
		int t2 = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(fibonacciMod(t1, t2, n).toString());
		scanner.close();
	}
}
