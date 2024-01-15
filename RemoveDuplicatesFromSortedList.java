//Time Complexity - O(n)
//Space Complexity - O(1)
package LinkedLists;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(1);
		head.next=new Node(1);
		head.next.next=new Node(2);
		head.next.next.next=new Node(3);
		head.next.next.next.next=new Node(3);
		head.next.next.next.next.next=new Node(3);
		head.next.next.next.next.next.next=new Node(6);
		
		Node temp=head;
		
		while(temp!=null) {
			while(temp.next!=null && temp.data==temp.next.data) {
				temp.next=temp.next.next;
				
			}
			
			temp=temp.next;
		}
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
		
	}

}
