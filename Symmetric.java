package TreesAndGraphs;

public class Symmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree=new Tree(1);
		tree.left=new Tree(2);
		tree.right=new Tree(2);
		
		boolean result=checkSymmetric(tree.left,tree.right);
		System.out.println(result);
	}
	
	public static boolean checkSymmetric(Tree l,Tree r) {
		if(l==null && r==null)
			return true;
		
		
		else if(l!=null && r!=null) {
			return l.data==r.data &&
			checkSymmetric(l.left,r.right) &&
			checkSymmetric(l.right,r.left);
		}
		
		return false;
	}
	
	
	

}

class Tree{
	Tree left;
	int data;
	Tree right;

	Tree(int data){
		this.data=data;
		left=null;
		right=null;
	}
	
}

