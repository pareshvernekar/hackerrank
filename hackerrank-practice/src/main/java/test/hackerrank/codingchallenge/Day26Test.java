package test.hackerrank.codingchallenge;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-nested-logic
 */
public class Day26Test {

	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int sum1=0,sum2=0;
		int actday = scanner.nextInt();
		int actMth = scanner.nextInt();
		int actYr = scanner.nextInt();
		int expDay = scanner.nextInt();
		int expMath = scanner.nextInt();
		int expYr = scanner.nextInt();
		if (expYr > actYr) {	//not overdue
			System.out.println(0);
		} else if (expYr < actYr) {
			System.out.println(10000);
		} else {	//same yr
			
			if (expMath > actMth) {
				System.out.println(0);
			} else if (expMath < actMth) {
				System.out.println(500 * (int)Math.abs(actMth-expMath));
			} else {	//same month
				if (expDay > actday) {
					System.out.println(0);
				} else if (expDay < actday) {
					System.out.println(15 * (int)Math.abs(actday-expDay));
				} else {
					System.out.println(0);
				}
			}
		}
		scanner.close();
	}
	
}
