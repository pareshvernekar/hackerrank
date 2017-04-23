package test.hackerrank.codingchallenge;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-linked-list-deletion
 */
class LinkedNode{
	int data;
	LinkedNode next;
	LinkedNode(int d){
        data=d;
        next=null;
    }
	
}


public class Day24Test {
	
	 public static LinkedNode removeDuplicates(LinkedNode head) {
	      //Write your code here
		 if (head == null || head.next==null) {
			 return head;
		 }
			 
		 LinkedNode newHead = head;
		 LinkedNode start=head;
		 LinkedNode next = head.next;
		 LinkedNode temp = null;
		 while (next != null) {
			 if (start.data == next.data) {
				 while (next != null && start.data == next.data) {
					 next=next.next;
				 }
				 start.next=next;
		 } else {
				 start = next;
				 next = next.next;
			 }
		 }
		 return newHead;
	 }
	 public static  LinkedNode insert(LinkedNode head,int data)
     {
		 LinkedNode p=new LinkedNode(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
        	LinkedNode start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(LinkedNode head)
        {
    	LinkedNode start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
    
    public static void main(String[] argv) {
    	Scanner sc=new Scanner(System.in);
       LinkedNode head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}
