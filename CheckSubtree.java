package TreesAndGraphs;

public class CheckSubtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode tree = new TreeNode(5);
		tree.left=new TreeNode(3);
		tree.left.left=new TreeNode(2);
		tree.left.right=new TreeNode(4);
		tree.right=new TreeNode(7);
		tree.right.left= new TreeNode(6);
		
		TreeNode tree2 = new TreeNode(3);
		tree2.left=new TreeNode(2);
		tree2.left.right=new TreeNode(4);
		

		boolean result=containsTree(tree,tree2);
		System.out.println(result);
	}
	
	public static boolean containsTree(TreeNode tree, TreeNode tree2) {
		if(tree2==null) {
			return true;
		}
		
		return subtree(tree,tree2);
	}
	
	public static boolean subtree(TreeNode t1, TreeNode t2) {
		if(t1==null)
			return false;
		
		else if(t1.val==t2.val && matchTree(t1,t2))
			return true;
		return subtree(t1.left,t2)||subtree(t1.right,t2);
	}

	public static boolean matchTree(TreeNode t1,TreeNode t2) {
		if(t1==null && t2==null)
			return true;
		else if(t1==null || t2==null)
			return false;
		
		else if(t1.val!=t2.val)
			return false;
		
		else
			return matchTree(t1.left,t2.left) && matchTree(t1.right,t2.right);
	}
}
