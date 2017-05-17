package test.hackerrank.codeweek32;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/contests/w32/challenges/duplication
 */
public class Duplication {
	
	static StringBuilder s = new StringBuilder();
	static void init() {
		s.append(0);
		s = buildT(s);
	}
	static StringBuilder buildT(StringBuilder source) {
		StringBuilder target = new StringBuilder();
		while (source.length() < 1000) {
			int len = source.length();
			for (int i=0;i<len;i++) {
				byte b =(byte)( 1 - Byte.valueOf(""+source.charAt(i)));
				target.append(b);
			}
			source.append(target);
			target = new StringBuilder();
		}
		return source;
	}
	
	static String duplication(int x){
	        // Complete this function
			return ""+s.charAt(x);
	}

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        init();
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int x = in.nextInt();
	            String result = duplication(x);
	            System.out.println(result);
	        }
	    }

}
