//find kth element to last element
package LinkedLists;

public class kthelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(1);
		Node temp=head;
		temp.next=new Node(9);
		temp=temp.next;
		temp.next=new Node(2);
		temp.next.next = new Node(5);
		
		//Solution:
		int k=5;int i=1;
		
		while(head!=null && i<=k-1) {
			head=head.next;
			i++;
		}
		if(head==null)
			System.out.println("Out of bonds");
		
		
		else {
			while(head!=null) {
				System.out.println(head.data);
				head=head.next;
			}
		}
	}

}

//class Node{
//	Node next;
//	int val;
//	
//	Node(int data){
//		val=data;
//	}
//}
