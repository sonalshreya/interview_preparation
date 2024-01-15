package TreesAndGraphs;

public class Max_depth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(4);
		tree.left=new TreeNode(2);
		tree.left.left=new TreeNode(1);
		tree.left.right=new TreeNode(5);
		tree.right=new TreeNode(10);
		tree.right.left= new TreeNode(9);
		
		int d=max_depth(tree);
		System.out.println(d);
	}
	
	public static int max_depth(TreeNode tree) {
		if(tree==null)
			return 0;
		
		int lh=max_depth(tree.left);
		int rh=max_depth(tree.right);
		
		return 1+Math.max(lh, rh);
	}

}
