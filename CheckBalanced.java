package TreesAndGraphs;

public class CheckBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(4);
		tree.left=new TreeNode(2);
		tree.left.left=new TreeNode(1);
		tree.left.right=new TreeNode(5);
		tree.right=new TreeNode(10);
		tree.right.left= new TreeNode(9);
		tree.right.left.left= new TreeNode(15);
		tree.right.left.left.left= new TreeNode(19);
		int d=isBalanced(tree);
		if(d==-1)
		System.out.println("Not balanced");
		else
			System.out.println("balanced");
	}
	
	public static int isBalanced(TreeNode root) {
		
		if(root==null)
			return 0;
		
		int lh=isBalanced(root.left);
		if(lh==-1)
			return -1;
		
		int rh=isBalanced(root.right);
		if(rh==-1)
			return -1;
		
		if(Math.abs(lh-rh)>1)
			return -1;
		
		return 1+Math.max(lh, rh);
	}

}
