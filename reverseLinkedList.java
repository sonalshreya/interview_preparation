package LinkedLists;

public class reverseLinkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		Node temp=head;
		temp.next=new Node(9);
		temp=temp.next;
		temp.next=new Node(2);
		temp.next.next = new Node(7);
		
		Node curr=head;
		Node prev=null;
		Node tem=null;
		while(curr!=null) {
			tem=curr.next;
			curr.next=prev;
			prev=curr;
			curr=tem;
		}
		//System.out.println(prev.data);
		
		while(prev!=null) {
			System.out.println(prev.data);
			prev=prev.next;
		}
		
	}
}

