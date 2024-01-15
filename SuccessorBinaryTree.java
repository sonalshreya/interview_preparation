package TreesAndGraphs;

public class SuccessorBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeParent tree = new TreeParent(5);
		tree.parent=null;
		tree.left=new TreeParent(3);
		tree.left.parent=tree;
		tree.left.left=new TreeParent(2);
		tree.left.left.parent=tree.left.parent;
		tree.left.right=new TreeParent(4);
		tree.left.right.parent=tree.left;
		tree.right=new TreeParent(7);
		tree.right.parent=tree;
		tree.right.left= new TreeParent(6);
		tree.right.left.parent=tree.right;
		
		TreeParent result=succ(tree.left);
		System.out.println(result.data);
	}
	
	public static TreeParent succ(TreeParent root) {
		//2 conditions::
		TreeParent temp=root;
		if(temp.right!=null) {
			
			temp=temp.right;
			while(temp.left!=null) {
				temp=temp.left;
			}
			return temp;
		}
		
		while(temp.parent!=null && temp.parent.right == temp) {
			temp=temp.parent;
		}
		return temp;
	}

}

class TreeParent{
	TreeParent left;
	TreeParent right;
	TreeParent parent;
	int data;
	TreeParent(int data){
		this.data=data;
		this.left=null;
		this.right=null;
		this.parent=null;
	}
}
