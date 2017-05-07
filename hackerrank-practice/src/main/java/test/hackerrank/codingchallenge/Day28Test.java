package test.hackerrank.codingchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-regex-patterns
 */

public class Day28Test {
	
	static void findGmail(String[] name, String[] email) {
		int i = 0;
		String emailStr = null;
		List<EmailNode> emailNodes = new ArrayList<>();
		for (String key:name) {
			emailStr = email[i++];
		//.out.println("key:"+key+":name:"+name);
			if (endsWith(emailStr, ".*@gmail[.]com$"))
				emailNodes.add(new EmailNode(key, emailStr));
		}
		Collections.sort(emailNodes);
		for (EmailNode temp:emailNodes) {
			System.out.println(temp.name);
		}
	}
	
	static boolean endsWith(String key, String pattern) {
		  return key.matches(pattern);
		
	}
	
	public static void main(String[] argv) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String name[] = new String[N];
		String email[] = new String[N];
		for (int i=0;i<N;i++) {
			name[i] = scanner.next();
			email[i]=scanner.next();
		}
		findGmail(name,email);
		scanner.close();
	}

}

class EmailNode  implements Comparable<EmailNode>{
	String name;
	String email;
	EmailNode(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public int compareTo(EmailNode n) {
		
		if (n==null)
			return 1;
		return this.name.compareTo(n.name);
	}
}
