package test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/anagram
 */
public class StringAnagram {

	static int checkAnagram(String str) {
		int len = str.length();
		if (len %2 != 0) {
			return -1;
		}
	List<Character> ch1List = new ArrayList<>();
	List<Character> ch2List = new ArrayList<>();
		int half = len/2;
		for (int i=0;i<half;i++) {
			ch1List.add(str.charAt(i));
		}
		
		for (int i=half;i<len;i++) {
			ch2List.add(str.charAt(i));
		}
		ch1List.removeAll(ch2List);
		return ch1List.size();
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
