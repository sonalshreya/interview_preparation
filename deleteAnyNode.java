// Delete any node except the first and last node, given you are given access to only that node;

package LinkedLists;

public class deleteAnyNode {

	public static void main(String args[]) {
		Node head=new Node(1);
		Node temp=head;
		temp.next=new Node(9);
		temp=temp.next;
		temp.next=new Node(2);
		Node mid=temp.next;
		temp=temp.next;
		temp.next=new Node(3);
		
		temp.next.next = new Node(5);
		
		//Solution
		mid.data=mid.next.data;
		mid.next=mid.next.next;
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
