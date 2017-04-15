package test.hackerrank;

import java.util.Scanner;

public class MaximumSubArray {
	
	
	private static int maxContiguous(int[] arr) {
		
		int max_till_now = arr[0];
		int max_from_last = arr[0];
		for (int i=1;i<arr.length;i++) {
			max_till_now= arr[i] > (arr[i]+max_till_now)?arr[i]:(arr[i]+max_till_now);
			max_from_last=max_from_last > max_till_now?max_from_last:max_till_now;
			
		}
		return max_from_last;
	}
	
	private static int maxNonContiguous(int[] arr) {
		int sum = 0;
		for (int i = 0;i < arr.length;i++) {
			if (arr[i] >=0)
				sum+=arr[i];
		}
		if (sum == 0)
			return maxContiguous(arr);
		return sum;
	}
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int T  = scanner.nextInt();
		int[] countArr = new int[T];
		int[][] dataArr = new int[T][];
		for (int i = 0;i< countArr.length;i++) {
			countArr[i] = scanner.nextInt();
			dataArr[i]=new int[countArr[i]];
			for (int j=0;j<countArr[i];j++) {
				dataArr[i][j]=scanner.nextInt();
			}
		}
		for (int i=0;i<T;i++) {
			System.out.println(maxContiguous(dataArr[i])+" "+maxNonContiguous(dataArr[i]));
		}
		scanner.close();
	}

}
