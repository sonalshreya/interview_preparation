package LinkedLists;

public class event_odd_merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(1);
		head.next=new Node(3);
		head.next.next=new Node(15);
		head.next.next.next=new Node(31);
		head.next.next.next.next=new Node(22);
		
		Node even=head;
		Node odd=head.next;
		
		Node tempEven=even;
		Node tempOdd=odd;
		
		while(tempEven!=null && tempOdd!=null) {
			
			if(tempOdd.next!=null) {
				
				tempEven.next=tempOdd.next;
				
			}
			tempEven=tempEven.next;
			
			if(tempEven!=null || tempEven.next!=null) {
				
				tempOdd.next=tempEven.next;
				
			}
			tempOdd=tempOdd.next;
			
			
			
		}
		
		tempEven.next=odd;
		
		while(even!=null) {
			System.out.println(even.data);
			even=even.next;
		}
	}

}
