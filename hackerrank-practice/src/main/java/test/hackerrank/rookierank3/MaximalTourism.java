package test.hackerrank.rookierank3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximalTourism {
	
	static int getMax(int n, int[][] route) {
		int maxPossible = 0;
		
		List<City> cityList = init(n, route);
		for (City city:cityList) {
			int visited = getCityCount(city);
			maxPossible = (visited > maxPossible)?visited:maxPossible;
		}
		return maxPossible;
	}

	
	static int getCityCount(City city) {
		int count = 0;
		Stack<City> cityStack = new Stack<>();
		
		if (!city.visited) {
			city.visited=Boolean.TRUE;
			count+=1;
			cityStack.push(city);
		}
		while (!cityStack.isEmpty()) {
			City temp = cityStack.pop();
			if (temp.toRoutes != null && !temp.toRoutes.isEmpty()) {
				for (City dest:temp.toRoutes) {
					if (!dest.visited) {
						dest.visited=Boolean.TRUE;
						count+=1;
						cityStack.push(dest);
					}
				}
			}
		}
		return count;
	}
	
	static List<City>init(int n, int[][] route) {
		List<City> cityList = new ArrayList<City>(n);
		City temp = null;
		for (int i=0;i<n;i++) {
			cityList.add(new City(i+1));
		}
		for (int i=0;i<route.length;i++) {
			temp = cityList.get(route[i][0]-1);
			temp.toRoutes.add(cityList.get(route[i][1]-1));
			cityList.get(route[i][1]-1).toRoutes.add(temp);
		}
		return cityList;
	}
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] route = new int[m][2];
        for(int route_i=0; route_i < m; route_i++){
            for(int route_j=0; route_j < 2; route_j++){
                route[route_i][route_j] = in.nextInt();
            }
        }
        // Write Your Code Here
        System.out.println(getMax(n, route));
    }
	
}


class City {
	int number;
	boolean visited;
	List<City> toRoutes = new ArrayList<>();
	
	City(int n) {
		this.number = n;
	}
}