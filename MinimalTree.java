
package TreesAndGraphs;


public class MinimalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,7,8,11,13};
		TreeNode result=minimalTreeBST(arr,0,arr.length-1);
		printTree(result);
	}
	
	public static TreeNode minimalTreeBST(int arr[],int start,int end) {
		if(end<start)
			return null;
		
		int mid=(start+end)/2;
		
		TreeNode node=new TreeNode(arr[mid]);
		node.left=minimalTreeBST(arr,start,mid-1);
		node.right=minimalTreeBST(arr,mid+1,end);
		
		return node;
	}
	
	public static void printTree(TreeNode result) {
		if(result!=null) {
			System.out.println(result.val);
			printTree(result.left);
			printTree(result.right);
		}
		
	}

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		left=null;
		right=null;
		this.val=val;
	}
}
