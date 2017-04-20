package test.hackerrank.codingchallenge;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-binary-trees
 */
public class Day23Test {

	static void levelOrder(Node root){
	      //Write your code here
		Queue<Node> nodeQueue = new ArrayDeque<>();
		Node temp;
		if (root != null) {
			nodeQueue.add(root);
			while (!nodeQueue.isEmpty()) {
				temp = nodeQueue.poll();
				System.out.print(temp.data+" ");
				if (temp.left!=null) {
					nodeQueue.add(temp.left);
				}
				if (temp.right != null) {
					nodeQueue.add(temp.right);
				}
			}
		}
	      
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
            levelOrder(root);
        }	
}
