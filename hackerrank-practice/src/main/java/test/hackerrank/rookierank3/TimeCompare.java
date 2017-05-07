package test.hackerrank.rookierank3;

import java.util.Scanner;

public class TimeCompare {
	
	 static String timeCompare(String t1, String t2){
	        // Complete this function
		 if( (t1.endsWith("AM") && t2.endsWith("AM"))
			||
			(t1.endsWith("PM") && t2.endsWith("PM"))
			) {
			 
			 if (t1.startsWith("12") && !t2.startsWith("12"))
				 return "First";
			 else if (t2.startsWith("12") && !t1.startsWith("12"))
					return "Second";
			 
			 String temp1=t1.startsWith("0")?t1.substring(1, t1.length()-2):t1.substring(0, t1.length()-2);
			 String temp2=t2.startsWith("0")?t2.substring(1, t2.length()-2):t2.substring(0, t2.length()-2);
			 
			 
			 temp1=temp1.replace(':', '.');
			 temp2=temp2.replace(':', '.');
			 Double time1=Double.valueOf(temp1);
			 Double time2=Double.valueOf(temp2);
			 return (time1.compareTo(time2) < 0?"First":"Second");
			 
		 } else if (t1.endsWith("AM") && t2.endsWith("PM")) {
			 return "First";
		 } else  {
			 return "Second";
		 }
		 
		 
	 }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String t1 = in.next();
	            String t2 = in.next();
	            String result = timeCompare(t1, t2);
	            System.out.println(result);
	        }
	    }

}
