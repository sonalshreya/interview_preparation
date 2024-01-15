package TreesAndGraphs;

public class Successor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode tree = new TreeNode(5);
		tree.left=new TreeNode(3);
		tree.left.left=new TreeNode(2);
		tree.left.right=new TreeNode(4);
		tree.right=new TreeNode(7);
		tree.right.left= new TreeNode(6);
		
		
		TreeNode suc= succ(tree,4);

		System.out.println(suc.val);
	}
	
	public static TreeNode succ(TreeNode root,int val) {
		TreeNode s=null;
		
		while(root!=null) {
			if(root.val<= val) {
				root=root.right;
			}
			else {
				s=root;
				root=root.left;
			}
		}
		
		return s;
	}

}
