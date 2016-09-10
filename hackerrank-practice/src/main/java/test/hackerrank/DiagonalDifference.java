package test.hackerrank;

import java.util.Scanner;

/*
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

	Input Format

	The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

	Output Format

	Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

	Sample Input
	
	3
	11 2 4
	4 5 6
	10 8 -12
	Sample Output
	
	15
 *
 */
public class DiagonalDifference {

	public int difference(int[][] arr) {
		int sum1 = 0, sum2 = 0;
		
		int n = arr.length;
		
		for (int i = 0;i<n;i++) {
			sum1+=arr[i][i];
		}
		int j = 0;
		for (int i = n-1;i >=0 ;i--) {
			sum2+=arr[i][j];
			j+=1;
		}
		return Math.abs(sum1 - sum2);
	}
	
    public static void main( String[] args ) {
    	
    	DiagonalDifference diagDiff = new DiagonalDifference();
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0;i < n;i++) {
        	for (int j = 0;j < n; j++) {
        		arr[i][j] = scanner.nextInt();
        	}
        }
        System.out.println(diagDiff.difference(arr));
    }
}
