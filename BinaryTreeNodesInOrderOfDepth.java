package stack_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNodesInOrderOfDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		
		LinkedList<LinkedList<TreeNode>> result=new LinkedList<LinkedList<TreeNode>>();
		
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			LinkedList<TreeNode> list=new LinkedList<TreeNode>();
			int siz=q.size();
			
			for(int i=0;i<siz;i++) {
				TreeNode node=q.poll();
				if(node.left!=null) {
					q.add(node.left);
				}
				if(node.right!=null) {
					q.add(node.right);
				}
				
				list.add(node);
			}
			
			result.add(list);
		}
		
		for(LinkedList<TreeNode> list:result) {
			for(TreeNode t:list) {
				System.out.print(t.data+" ");
			}
			System.out.println();
		}
	}

}

class TreeNode{
	TreeNode left;
	int data;
	TreeNode right;
	
	TreeNode(int data){
		this.left=null;
		this.data=data;
		this.right=null;
	}
}
