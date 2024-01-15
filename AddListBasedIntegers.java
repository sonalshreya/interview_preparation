package LinkedLists;

public class AddListBasedIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head1=new Node(1);
		head1.next=new Node(2);
		head1.next.next=new Node(3);
		
		Node head2=new Node(9);
		head2.next=new Node(6);
		head2.next.next=new Node(5);
		
		Node dummyHead=new Node(0);
		Node sum=dummyHead;
		int carry=0;
		
		while(head1!=null || head2!=null || carry!=0) {
			
			int val=carry+(head1!=null? head1.data:0)+(head2!=null?head2.data:0);
			
			head1=head1!=null?head1.next:null;
			head2=head2!=null?head2.next:null;
			
			sum.next=new Node(val%10);
			
			carry=val/10;
		
			sum=sum.next;
		}
		dummyHead=dummyHead.next;
		while(dummyHead!=null) {
			System.out.println(dummyHead.data);
			dummyHead=dummyHead.next;
		}
	}

}
