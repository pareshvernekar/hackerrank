package test.hackerrank.codingchallenge;

import java.util.*;

public class Day1Test {
	
	public static void main(String[] argv) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank";
		Scanner scan = new Scanner(System.in);
		int i1= scan.nextInt();
		double d1=scan.nextDouble();
		String s1="";
		while (scan.hasNext()) {
			s1=s1+scan.next() +" ";
		}
		System.out.println(i+i1);
		System.out.println(d+d1);
		System.out.println(s+s1.trim());
		
		
		
	}

}
