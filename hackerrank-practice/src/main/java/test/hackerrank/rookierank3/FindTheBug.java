package test.hackerrank.rookierank3;

import java.util.Scanner;

public class FindTheBug {

	
	static int[] findTheBug(String[] grid){
        // Complete this function
		
		int[] index = new int[2];
		int i = 0;
		for(String str:grid) {
			if (str.indexOf('X') != -1) {
				index[0] = i;
				index[1] = str.indexOf('X');
				break;
			}
			i+=1;
		}
		return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        // Return an array containing [r, c]
        int[] result = findTheBug(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
        }
        System.out.println("");
        

    }
}
