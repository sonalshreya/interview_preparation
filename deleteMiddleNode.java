package LinkedLists;

public class deleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=new Node(1);
		Node temp=head;
		temp.next=new Node(9);
		temp=temp.next;
		temp.next=new Node(2);
		temp=temp.next;
		temp.next=new Node(3);
		temp.next.next = new Node(5);
		
		Node fast=head;
		Node slow=head;
		Node prev=null;
		while(fast.next!=null && fast.next.next!=null && slow.next!=null) {
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		//System.out.println(slow.data);
		prev.next=slow.next;
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;}

	}

}
