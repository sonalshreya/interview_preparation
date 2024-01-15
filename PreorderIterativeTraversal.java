package TreesAndGraphs;

import java.util.*;

public class PreorderIterativeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree(5);
		tree.left=new Tree(3);
		tree.left.left=new Tree(2);
		tree.left.right=new Tree(4);
		tree.right=new Tree(7);
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		Stack<Tree> st=new Stack<Tree>();
		st.add(tree);
		while(!st.isEmpty()) {
			Tree curr=st.pop();
			
			result.add(curr.data);
			if(curr.right!=null)
				st.add(curr.right);
			if(curr.left!=null)
				st.add(curr.left);
		}
		
		for(int i:result) {
			System.out.println(i);
		}
	}

}
