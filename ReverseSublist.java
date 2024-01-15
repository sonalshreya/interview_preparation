package LinkedLists;

public class ReverseSublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		Node dummyHead = new Node(0);
		dummyHead.next=head;
		Node sublist=dummyHead;
	
		int s=2;
		int f=4;
		
		int i=1;
		while(i++<s) {
			sublist=sublist.next;
		}
		//System.out.println(sublist.data);
		
		Node sublister=sublist.next;
		
		while(s++<f) {
			Node temp=sublister.next;
			sublister.next=temp.next;
			temp.next=sublist.next;
			sublist.next=temp;
		}
		
		dummyHead=dummyHead.next;
		
		while(dummyHead!=null) {
			System.out.println(dummyHead.data);
			dummyHead=dummyHead.next;
		}
		
	}

}
