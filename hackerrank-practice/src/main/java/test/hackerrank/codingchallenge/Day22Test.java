package test.hackerrank.codingchallenge;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-binary-search-trees
 */
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day22Test {
	 static int maxCount = 0;
	    public static int getHeight(Node root){
	      //Write your code here
	              inOrder(root,0);
	        return maxCount;
	  
	    }

	    static void inOrder(Node temp, int currCount) {
	        if (temp != null && temp.left != null) {
	            inOrder(temp.left,currCount+1);
	        }
	        if (temp != null && temp.right != null) {
	            inOrder(temp.right,currCount+1);
	        }
	        maxCount=maxCount<currCount?currCount:maxCount;
	    	currCount-=1;
	   	 
	    }

	    public static Node insert(Node root,int data){
	        if(root==null){
	            return new Node(data);
	        }
	        else{
	            Node cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
		 public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        Node root=null;
	        while(T-->0){
	            int data=sc.nextInt();
	            root=insert(root,data);
	        }
	        int height=getHeight(root);
	        System.out.println(height);
	    }
}
