package test.hackerrank.codingchallenge;

import java.io.FileInputStream;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-sorting
 */
public class Day20Test {
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int numSwaps = 0;
		int temp = 0;
		boolean swapped = Boolean.FALSE;
		for (int i=0;i<n-1;i++) {
			 swapped = Boolean.FALSE;
			for (int j=i+1;j <n;j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					numSwaps+=1;
					swapped = Boolean.TRUE;
				}
			}
		}
		System.out.println("Array is sorted in "+numSwaps+" swaps.");
		System.out.println("First Element: "+arr[0]);
		System.out.println("Last Element: "+arr[n-1]);
	}
 
	/*public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) 
			arr[i] = scanner.nextInt();
		bubbleSort(arr);
		scanner.close();
		
	} */
	 
	public static void main(String[] argv) {
		
		try {
		FileInputStream fis = new FileInputStream("c:\\tmp\\bubble_sort.txt");
		Scanner scanner = new Scanner(fis);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) 
			arr[i] = scanner.nextInt();
		bubbleSort(arr);
		fis.close();
		scanner.close();
		
		} catch (Exception ex) {
			
		}
		
	}
}
