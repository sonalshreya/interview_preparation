package TreesAndGraphs;

public class RootToLeafWithSpecifiedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(5);
		tree.left=new TreeNode(3);
		tree.left.left=new TreeNode(2);
		tree.left.right=new TreeNode(4);
		tree.right=new TreeNode(7);
		tree.right.left= new TreeNode(6);
		
		int target=12;
		boolean result=rootLeafSum(tree,target);
		
		System.out.println(result);
	}
	
	public static boolean rootLeafSum(TreeNode tree,int target) {
		
		if(tree==null)
			return false;
	
		else if(tree.left==null && tree.right==null) {
			return target==tree.val;
		}
		
		return rootLeafSum(tree.left,target-tree.val) || rootLeafSum(tree.right,target-tree.val);
		
	}

}
