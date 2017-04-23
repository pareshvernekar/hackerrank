package test.hackerrank;

import java.util.Scanner;

public class LonelyInteger {

	static int alone(int[] arr) {
		int sum = 0;
		for (int i:arr) {
			sum ^=i;
		}
		return sum;
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println(alone(arr));
		scanner.close();
	}
}
