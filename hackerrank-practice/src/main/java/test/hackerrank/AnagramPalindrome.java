package test.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/game-of-thrones
 */
public class AnagramPalindrome {
	
	public boolean isAnagramPalindrome(String s) {
		if (s==null || s.length()==0)
			return Boolean.FALSE;
		int oddCount = -1;
		Map<Character,Integer> countMap = new HashMap<>();
		char[] ch = s.toCharArray();
		for (char c:ch) {
			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			} else {
				countMap.put(c, 1);
			}
				
		}
		
		for (int i:countMap.values()) {
			if (i%2!=0) {
				if (oddCount == -1)
					oddCount = 1;
				else
					return Boolean.FALSE;	
			}
		}
		return Boolean.TRUE;
	}
	
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		AnagramPalindrome aP = new AnagramPalindrome();
		System.out.println(aP.isAnagramPalindrome(str)?"YES":"NO");
		scanner.close();
	}

}
