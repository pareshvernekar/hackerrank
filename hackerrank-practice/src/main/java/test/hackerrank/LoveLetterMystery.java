package test.hackerrank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 */
public class LoveLetterMystery {

	static Map<Character, Character> reduceMap = new HashMap<>();
	
	static {
		reduceMap.put('z','y');
		reduceMap.put('y','x');
		reduceMap.put('x','w');
		reduceMap.put('w','v');
		reduceMap.put('v','u');
		reduceMap.put('u','t');
		reduceMap.put('t','s');
		reduceMap.put('s','r');
		reduceMap.put('r','q');
		reduceMap.put('q','p');
		reduceMap.put('p','o');
		reduceMap.put('o','n');
		reduceMap.put('n','m');
		reduceMap.put('m','l');
		reduceMap.put('l','k');
		reduceMap.put('k','j');
		reduceMap.put('j','i');
		reduceMap.put('i','h');
		reduceMap.put('h','g');
		reduceMap.put('g','f');
		reduceMap.put('f','e');
		reduceMap.put('e','d');
		reduceMap.put('d','c');
		reduceMap.put('c','b');
		reduceMap.put('b','a');
	}
	
	static int minimalPalindromeMoves(String s) {
		
		if (isPalindrome(s)) return 0;
		int moves = 0;
		Queue<Character> wordQueue = new LinkedList<>();
		Stack<Character> wordStack = new Stack<>();
		
		int len = s.length();
		int mid=(len+1)/2;
		for (int i = 0;i<mid;i++) {
			wordQueue.offer(s.charAt(i));
		}
		for (int i = mid;i<len;i++) {
			wordStack.push(s.charAt(i));
		}
	
		char ch1,ch2;
		while (!wordStack.isEmpty()) {
			ch1=wordQueue.poll();
			ch2=wordStack.pop();
			if (ch1==ch2) 
				continue;
			else {
				if (ch1 < ch2) {
					while (ch1!=ch2) {
						if (!reduceMap.keySet().contains(ch2)) break;
						ch2=reduceMap.get(ch2);
						moves+=1;
					}
				} else {
					while (ch1!=ch2) {
						if (!reduceMap.keySet().contains(ch1)) break;
						ch1=reduceMap.get(ch1);
						moves+=1;
					}
				}
			}
		}
		return moves;
	}
	
	
	static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
	public static void main(String[] argv) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] arr = new String[n];
		for (int i=0;i<n;i++) {
			arr[i]=scanner.next();
		}
		for (int i=0;i<n;i++) {
			System.out.println(minimalPalindromeMoves(arr[i]));
		}
		
		scanner.close();
	}
}
