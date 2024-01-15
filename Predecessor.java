package TreesAndGraphs;

public class Predecessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(5);
		tree.left=new TreeNode(3);
		tree.left.left=new TreeNode(2);
		tree.left.right=new TreeNode(4);
		tree.right=new TreeNode(7);
		tree.right.left= new TreeNode(6);
		
		TreeNode p=pred(tree,4);
		
		System.out.println(p.val);
	}
	
	public static TreeNode pred(TreeNode root, int val) {
		
		TreeNode p=null;
		
		while(root!=null) {
			if(val<=root.val) {
				root=root.left;
			}
			else {
				p=root;
				root=root.right;
			}
		}
		
		return p;
	}

}
