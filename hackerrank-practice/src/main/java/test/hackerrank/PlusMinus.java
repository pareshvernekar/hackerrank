package test.hackerrank;

import java.util.Scanner;

/*
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array.
A decimal representing of the fraction of negative numbers in the array.
A decimal representing of the fraction of zeroes in the array.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
 */

public class PlusMinus {
	
	public static double[] fractions(int[] arr) {
		
		double[] result = new double[3];
		int zeroCount = 0, posCount = 0, negCount = 0;
		int n = arr.length;
		
		for (int i = 0;i < n; i++) {
			if (arr[i] == 0)
				zeroCount+=1;
			else if (arr[i] > 0)
				posCount+=1;
			else
				negCount+=1;
		}
		result[0] = (double)zeroCount/(double)n;
		result[1] = (double)posCount/n;
		result[2] = (double)negCount/n;
		
		return result;
	}
	
	public static void main(String[] argv) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0;i < n;i++) 
			arr[i] = scanner.nextInt();
		
		double[] result = fractions(arr);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[0]);
	}

}
