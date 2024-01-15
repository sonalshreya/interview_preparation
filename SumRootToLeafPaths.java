package TreesAndGraphs;

public class SumRootToLeafPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeNode tree = new TreeNode(5);
		tree.left=new TreeNode(3);
		tree.left.left=new TreeNode(2);
		tree.left.right=new TreeNode(4);
		tree.right=new TreeNode(7);
		tree.right.left= new TreeNode(6);
		int sum=0;
		sum=sumrootTLeaf(tree,sum);
		
		System.out.println(sum);
	}
	
	public static int sumrootTLeaf(TreeNode tree,int sum) {
		if(tree==null)
			return 0;
		
		sum=tree.val+sum*10;
		if(tree.left==null && tree.right==null) {
			return sum;
		}
		
		return sumrootTLeaf(tree.left,sum)+sumrootTLeaf(tree.right,sum);
	}

}
