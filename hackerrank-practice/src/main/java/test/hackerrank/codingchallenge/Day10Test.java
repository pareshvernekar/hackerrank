package test.hackerrank.codingchallenge;

import java.util.Scanner;

public class Day10Test {
	
	private static int consecutiveN(int n) {
		
		int count = 0;
		int result = 0;
		while (n != 0) {
			
			if ((n & 1 )== 1)
				count+=1;
			else {
				result=count > result?count:result;
				count = 0;
			}
			n>>>=1;
		}
		return (count > result?count:result);
	}

	public static void main(String[] argv) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(consecutiveN(n));
		scanner.close();
	}
}
