package test.hackerrank;

import java.util.Scanner;

public class PalindromeIndex {

	public boolean isPalindrome(String s) {
		if (s==null || s.length()==0) return Boolean.FALSE;
		if (s.equals(reverse(s))) 
			return Boolean.TRUE;
		else
			return Boolean.FALSE;
	}
	
	public String reverse(String s) {
		StringBuilder strBuilder = new StringBuilder(s);
		return strBuilder.reverse().toString();
	}
	
	public void makePalindrome(String s) {
		int index = -1;
		if (isPalindrome(s))  {
			System.out.println(index);
			return;
		}
		String str = null;
		int start = 0;
		int len = s.length()-1;
		int end = s.length()-1;
		while (start != end){
			str = null;
			if (s.charAt(start) == s.charAt(end)) {
				s+=1;
				end-=1;
				continue;
			} else {
				if (start==0)
					str = s.substring(1);
				else 
					str = s.substring(0,start)+s.substring(start+1,len);
				if (isPalindrome(str)) {
					index = start;
					break;
				} 
				if (end == len)
					str = s.substring(0,end-1);
				else
					str = s.substring(0,end)+s.substring(end+1,len);
				if (isPalindrome(str)) {
					index = end;
					break;
				}
			}
		}
		System.out.println(index);
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		PalindromeIndex pI = new PalindromeIndex();
		int T = scanner.nextInt();
		String[] strArr = new String[T];
		for (int i=0;i < T;i++) {
			strArr[i]=scanner.next();
		}
		for (int i=0;i < T;i++) {
			pI.makePalindrome(strArr[i]);
		}
		
		scanner.close();
	}
}
