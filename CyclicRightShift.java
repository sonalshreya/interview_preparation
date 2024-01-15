//Implemented concept of remove kth element from book elements of programming language
package LinkedLists;

public class CyclicRightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(2);
		head.next=new Node(3);
		head.next.next=new Node(5);
		head.next.next.next=new Node(3);
		head.next.next.next.next=new Node(2);
		Node dummyHead=new Node(0);
		dummyHead.next=head;
		Node first=head;
		Node second=dummyHead;
		
		int k=3;
		while(k-->0) {
			first=first.next;
			
		}
		Node prev=null;
		while(first!=null) {
			if(first.next==null)
				prev=first;
			first=first.next;
			second=second.next;
		}
		
		dummyHead.next=second.next;
		//System.out.println(dummyHead.next.data);
		prev.next=head;
		//System.out.println(prev.next.data);
		second.next=null;
		dummyHead=dummyHead.next;
		while(dummyHead!=null) {
			System.out.println(dummyHead.data);
			dummyHead=dummyHead.next;
		}
	}

}
