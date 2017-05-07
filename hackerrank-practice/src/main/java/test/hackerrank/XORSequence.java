package test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XORSequence {
	
	static List<Long> arrList = new ArrayList<>();
	
	private static long xorRange(long L, long R) {
		long result = 0;
		for (long l=L;l<=R;l++) {
			result^=calXOR(l);
		}
	}
	
	private static long calXOR(long n) {
		if (n == 0) 
			return 0;
		if (arrList.get(n)!= null)
			return arrList[n];
	}
	
	public static void main(String[] argv) {
		Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            long L = in.nextLong();
            long R = in.nextLong();
        }
	}

}
