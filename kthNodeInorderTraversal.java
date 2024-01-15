package TreesAndGraphs;

import java.util.Stack;

public class kthNodeInorderTraversal {

	public static void main(String[] args) {
		Tree tree = new Tree(5);
		tree.left=new Tree(3);
		tree.left.left=new Tree(2);
		tree.left.right=new Tree(4);
		tree.right=new Tree(7);
		int k=3;
		int result=0;
		Tree curr=tree;
		Stack<Tree> st=new Stack<Tree>();
		
		while(!st.isEmpty() || curr!=null) {
			
			if(curr!=null) {
				st.add(curr);
				curr=curr.left;
			}
			
			else {
				curr=st.pop();
				k--;
				if(k==0) {
					result=curr.data;
					System.out.println(result);
					System.exit(0);
				}
				
				curr=curr.right;
			}
		}
	}
	
}
