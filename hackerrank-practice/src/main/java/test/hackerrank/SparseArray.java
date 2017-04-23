package test.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/sparse-arrays
 */
public class SparseArray {

	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		String str = null;
		Map<String,Integer> strCountMap = new HashMap<>();
		for (int i=0;i<n;i++) {
			str = scanner.next();
			if (strCountMap.containsKey(str))
				strCountMap.put(str, strCountMap.get(str)+1);
			else
				strCountMap.put(str, 1);
		}
		int k = scanner.nextInt();
		String[] query = new String[k];
		for (int i=0;i<k;i++) {
			query[i]=scanner.next();
		}
		
		for (int i=0;i<k;i++) {
			System.out.println(""+(strCountMap.containsKey(query[i])?strCountMap.get(query[i]):0));	
		}	
		scanner.close();
	}
}
