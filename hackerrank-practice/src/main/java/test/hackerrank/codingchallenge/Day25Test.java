package test.hackerrank.codingchallenge;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity
 */
public class Day25Test {

	
	static void  checkPrime(int[] arr) {
		
		int len = arr.length;
		int count = 0;
		boolean isPrime = Boolean.TRUE;
		for (int i=0;i<len;i++) {
			isPrime = Boolean.TRUE;
			if (arr[i]==2) {
				System.out.println("Prime");
				continue;
			} else if (arr[i]==1) {
				System.out.println("Not prime");
				continue;
			} else if (isEven(arr[i])) {
				System.out.println("Not prime");
				continue;
			} else {
				for (int j=3;j<=Math.sqrt(arr[i]);j+=2) {
					count+=1;
					if (arr[i]%j==0) {
						isPrime=Boolean.FALSE;
						break;
					}
				}
				if (isPrime)
					System.out.println("Prime");
				else
					System.out.println("Not prime");
			}
			System.out.println("arr[i]:"+arr[i]+":count:"+count);
		} 
	}
	
	private static boolean isEven(int n) {
		return (n%2==0);
	}
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		checkPrime(arr);
		scanner.close();
	}
}
