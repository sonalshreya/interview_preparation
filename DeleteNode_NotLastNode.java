//Delete the node in the linked list, guaranteed not to be the tail node
package LinkedLists;

public class DeleteNode_NotLastNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(3);
		head.next=new Node(9);
		Node test=new Node(7);
		head.next.next=test;
		head.next.next.next=new Node(96);
		head.next.next.next.next=new Node(29);
		
		delete(test);
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	//O(1) solution
	public static void delete(Node test) {
		test.data=test.next.data;
		test.next=test.next.next;
	}

}
