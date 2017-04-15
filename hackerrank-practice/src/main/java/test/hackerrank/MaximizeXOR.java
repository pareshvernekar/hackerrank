package test.hackerrank;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/maximizing-xor
 */

public class MaximizeXOR {
	
	public static int maximizeXOR(int L, int R) {
		int max = 0;
		for (int i=L;i<=R;i++) {
			for (int j=L;j<=R;j++) {
				max = (i^j)>max?(i^j):max;
			}
		}
		return max;
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int R = scanner.nextInt();
		System.out.println(maximizeXOR(L, R));
		scanner.close();
	}

}
