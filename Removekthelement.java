//Time Complexity=O(n)
//Space Complexity=O(1)
package LinkedLists;

public class Removekthelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(3);
		head.next=new Node(9);
		head.next.next=new Node(7);
		head.next.next.next=new Node(96);
		head.next.next.next.next=new Node(29);
		
		int k=3;
		Node dummyHead=new Node(0);
		dummyHead.next=head;
		Node first=dummyHead.next;
		Node second=dummyHead;
		while(k-- >0 ) {
			first=first.next;
		}
		while(first!=null) {
			first=first.next;
			second=second.next;
			
		}
		
		second.next=second.next.next;
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}

}
