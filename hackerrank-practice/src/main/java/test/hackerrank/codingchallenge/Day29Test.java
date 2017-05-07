package test.hackerrank.codingchallenge;

import java.util.Scanner;

public class Day29Test {
	
	static void printMax(int T,int[] N, int[] K) {
		
		int reqMin = 0, currMin = 0;
		for (int i=0;i<T;i++) {
			int[] temp = createSequence(N[i]);
			reqMin = K[i] -1;
			currMin = 0;
			for (int j=0;j<N[i]-1;j++) {
				for (int k=j+1;k<N[i];k++) {
					if (((temp[j] & temp[k]) > currMin) && !((temp[j] & temp[k]) > reqMin))
						currMin = temp[j] & temp[k];
					if (currMin == reqMin)
						break;
				}
				if (currMin == reqMin)
					break;
			}
			System.out.println(currMin);
		}
	}
	
	static int[] createSequence(int max) {
		int[] temp = new int[max];
		for (int i=1;i<=max;i++) {
			temp[i-1]=i;
		}
		return temp;
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
