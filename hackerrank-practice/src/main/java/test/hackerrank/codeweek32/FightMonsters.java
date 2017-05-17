package test.hackerrank.codeweek32;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/contests/w32/challenges/fight-the-monsters
 */
public class FightMonsters {
	
	 static int getMaxMonsters(int n, int hit, int t, int[] h){
	        // Complete this function
		 int count = 0;
		 Arrays.sort(h);
		 int monster = 0;
		 for (int i=0;i<n;i++) {
			 monster = h[i];
			 while (monster > 0 && t > 0) {
				 monster-=hit;
				 t--;
			 }
			 if  (monster <=0)
				 count+=1;
		 }
		 return count;
	 }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int hit = in.nextInt();
	        int t = in.nextInt();
	        int[] h = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        int result = getMaxMonsters(n, hit, t, h);
	        System.out.println(result);
	    }

}
