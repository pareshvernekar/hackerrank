package test.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/counter-game
 */
public class CounterGame {

	private static boolean isPowerOf2(BigInteger n) {
		
		return (n.bitCount()==1?Boolean.TRUE:Boolean.FALSE);
	}
	private static BigInteger reduceN(BigInteger N) {
		
		BigInteger temp;
		int count = 0;
		int bitCount = N.bitLength();
		BigInteger two = new BigInteger("2");
		temp = two.pow(bitCount);
		if (temp.compareTo(N) > 1)
			temp=two.pow(bitCount-1);
		return N.subtract(temp);
	}
	static String playGame(BigInteger N) {
		
		String winner = "Richard";
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		if (N.equals(one))
			return "Richard";
		while (N.compareTo(one) > 0) {
			if (isPowerOf2(N)) {
				N=N.divide(two);
			} else {
				N = reduceN(N);
			}
			winner="Richard".equals(winner)?"Louise":"Richard";
		}
		
		return winner;
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		BigInteger[] arr = new BigInteger[T];
		for (int i=0;i<T;i++) {
			arr[i] =  new BigInteger(scanner.next());
		}
		for (int i=0;i<T;i++) {
			System.out.println(playGame(arr[i]));
		}
		scanner.close();
	}
	
}
