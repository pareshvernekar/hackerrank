package test.hackerrank.codingchallenge;

import java.util.Scanner;

public class Day6Test {
	
	public static void main(String[] argv) {
		 Scanner scanner = new Scanner(System.in);
		 StringBuilder oddStr = null;
		 StringBuilder evenStr = null;
		 int n = scanner.nextInt();
		 String[] arr = new String[n];
		 for (int i = 0;i < n;i++) {
			 arr[i] = scanner.next();
		 }
		 for (int i = 0;i<n;i++) {
			 oddStr = new StringBuilder();
			 evenStr = new StringBuilder();
			 String s = arr[i];
			 for (int j = 0;j < s.length();j++) {
				 if (j%2==0)
					 evenStr.append(s.charAt(j));
				 else
					 oddStr.append(s.charAt(j));
			 }
			System.out.println(evenStr.toString()+" "+oddStr.toString());	 
		 }
	}

}
