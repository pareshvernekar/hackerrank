package test.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * https://www.hackerrank.com/challenges/gem-stones
 */
public class Gemstones {
	
	public int countGemStones(String[] arr) {
		int count = 0;
		boolean added = false;
		Set<Character> elementSet = new HashSet<>();
		
		for (String str:arr) {
			if (!added) {
				char[] ch = str.toCharArray();
				for (int i=0;i<ch.length;i++) {
					elementSet.add(ch[i]);
				}
				added = true;
			} else {
				char[] ch = str.toCharArray();
				Set<Character> tempSet = new HashSet<>();
				for (int i=0;i<ch.length;i++) {
					tempSet.add(ch[i]);
				}
				elementSet.retainAll(tempSet);
			}
		}
		
		count = elementSet.isEmpty()?0:elementSet.size();
		return count;
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] arr = new String[N];
		for (int i=0;i < N;i++) {
			arr[i] = scanner.next();
		}
		Gemstones g = new Gemstones();
		System.out.println(g.countGemStones(arr));
				
		scanner.close();
	}

}
