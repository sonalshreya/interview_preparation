//Lowest Common Ancestor
package TreesAndGraphs;

public class FirstCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(5);
		tree.left=new TreeNode(3);
		tree.left.left=new TreeNode(2);
		TreeNode p=tree.left.left;
		tree.left.right=new TreeNode(4);
		tree.right=new TreeNode(7);
		TreeNode q=tree.right;
		tree.right.left= new TreeNode(6);
		
		TreeNode result=commonnAncestor(tree,p,q);
		System.out.println(result.val);
	}
	
	public static TreeNode commonnAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root==null || root==p || root==q)
			return root;
		
		TreeNode left=commonnAncestor(root.left,p,q);
		TreeNode right=commonnAncestor(root.right,p,q);
		
		if(left==null)
			return right;
		else if(right==null)
			return left;
		else
			return root;
	}

}
