package test.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/anagram
 */
public class StringAnagram {

	static int checkAnagram(String str) {
		int len = str.length();
		int count = 0;
		String str1, str2;
		if (len %2 != 0) {
			return -1;
		}
		int half = len/2;
		str1=str.substring(0, half);
		str2=str.substring(half);
		for (int i=0;i<str2.length();i++) {
			if (str1.indexOf(str2.charAt(i)) == -1) {
				count+=1;
				continue;
			} else {
				String temp1 = str1.substring(0, str1.indexOf(str2.charAt(i)));
				String temp2 = str1.substring(str1.indexOf(str2.charAt(i))+1);
				str1=temp1+temp2;
			}
		}
		return count;
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] arr = new String[N];
		for (int i=0;i<N;i++) {
			arr[i]=scanner.next();
		}
		for (String str:arr) {
			System.out.println(checkAnagram(str));
		}
 		scanner.close();
	}
}
