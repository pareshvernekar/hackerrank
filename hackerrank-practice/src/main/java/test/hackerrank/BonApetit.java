package test.hackerrank;

import java.util.Scanner;
/*
Anna and Brian order 

items at a restaurant, but Anna declines to eat any of the 



item (where 





) due to an allergy. When the check comes, they decide to split the cost of all the items they shared; however, Brian may have forgotten that they didn't split the 



item and accidentally charged Anna for it.
You are given 

, 

, the cost of each of the 

items, and the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit; otherwise, print the amount of money that Brian must refund to Anna.
Input Format
The first line contains two space-separated integers denoting the respective values of 

(the number of items ordered) and 

(the 

-based index of the item that Anna did not eat). 
The second line contains 

space-separated integers where each integer 

denotes the cost, 




, of item 

(where 





). 
The third line contains an integer, 








, denoting the amount of money that Brian charged Anna for her share of the bill.
*/

public class BonApetit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int n  = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			if (i==k) continue;
			sum+=arr[i];
			
		}
		int charged = scanner.nextInt();
		int actual = sum/2;
		if (charged == actual) 
			System.out.println("Bon Appetit");
		else
			System.out.println(charged - actual);
		

	}

}
