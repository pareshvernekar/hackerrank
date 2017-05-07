package test.hackerrank.codingchallenge;

import java.util.Scanner;

public class Day29TestModified {
	
static void printMax(int T,int[] N, int[] K) {
		
		int reqMin = 0, currMin = 0;
		for (int i=0;i<T;i++) {
			int n = N[i];
			int k = K[i]; 
			if (((k-1)|k) <=n)
				System.out.println(k-1);
			else 
				System.out.println(k-2);
		}
	}
	

	public static void main(String[] argv) {
	
		Scanner scanner  = new Scanner(System.in);
		int T = scanner.nextInt();
		int[] N = new int[T];
		int[] K = new int[T];
		for (int i=0;i<T;i++) {
			N[i] = scanner.nextInt();
			K[i] = scanner.nextInt();
		}
		printMax(T,N,K);
		scanner.close();
	}
}
