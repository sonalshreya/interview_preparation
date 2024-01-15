package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(4);
		tree.left=new TreeNode(2);
		tree.left.left=new TreeNode(1);
		tree.left.right=new TreeNode(5);
		tree.right=new TreeNode(10);
		tree.right.left= new TreeNode(9);
		
		ArrayList<LinkedList<TreeNode>> d=max_depthLists(tree);
		for(LinkedList<TreeNode> al:d) {
			System.out.println("***");
			for(TreeNode ll: al) {
				System.out.print(ll.val+" ");
			}
		}
	}
	
	public static ArrayList<LinkedList<TreeNode>> max_depthLists(TreeNode tree) {
		ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
	
		LinkedList<TreeNode> current=new LinkedList<TreeNode>();
		if(tree!=null) {
			current.add(tree);
		}
		
		while(current.size()>0) {
			result.add(current);
			LinkedList<TreeNode> parents=current;
			current=new LinkedList<TreeNode>();
			
			for(TreeNode parent: parents) {
				if(parent.left!=null)
					current.add(parent.left);
				if(parent.right!=null)
					current.add(parent.right);
			}
		}
		
		return result;
	}

}
