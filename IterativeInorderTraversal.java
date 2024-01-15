package TreesAndGraphs;

import java.util.*;

public class IterativeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree(5);
		tree.left=new Tree(3);
		tree.left.left=new Tree(2);
		tree.left.right=new Tree(4);
		tree.right=new Tree(7);
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		Stack<Tree> st=new Stack<Tree>();
		Tree curr=tree;
		//st.push(tree);
		while(!st.isEmpty() || curr!=null) {
			if(curr!=null) {
			st.push(curr);
			curr=curr.left;
			}
			else {
				curr=st.pop();
				result.add(curr.data);
				curr=curr.right;
			}
		}
		
		for(Integer i:result) {
			System.out.println(i);
		}
	}

}
