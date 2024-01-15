package LinkedLists;



public class MergeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head1=new Node(2);
		head1.next=new Node(7);
		head1.next.next=new Node(9);
		
		Node head2=new Node(1);
		head2.next=new Node(8);
		head2.next.next=new Node(10);
		
		Node dummyHead=new Node(0);
		Node current=dummyHead;
		
		while(head1!=null && head2!=null) {
			if(head1.data>head2.data) {
				current.next=head2;
				head2=head2.next;
			}
			else {
				current.next=head1;
				head1=head1.next;
			}
			current=current.next;
		}
		
		current.next=(head1==null)?head2:head1;
		dummyHead=dummyHead.next;
		while(dummyHead!=null) {
			System.out.println(dummyHead.data);
			dummyHead=dummyHead.next;
		}
		
	}

}
