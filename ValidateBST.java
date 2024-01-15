package TreesAndGraphs;

public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(2);
		tree.left=new TreeNode(1);
		//tree.left.left=new TreeNode(1);
		//tree.left.right=new TreeNode(5);
		tree.right=new TreeNode(3);
		//tree.right.left= new TreeNode(9);
		ValidateBST v= new ValidateBST();
		
		boolean result=v.validBST(tree,Long.MIN_VALUE,Long.MAX_VALUE);
		System.out.println(result);
	}
	
	public boolean validBST(TreeNode root, long min, long max) {
		if(root==null)
			return true;
		
		if(root.val<=min || root.val>=max) {
			return false;
		}
		
		return validBST(root.left,min,root.val)
		&& validBST(root.right,root.val,max);
	}

}
