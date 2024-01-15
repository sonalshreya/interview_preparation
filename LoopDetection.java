package LinkedLists;

public class LoopDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head1 = new Node(10);
		Node newNode = new Node(15);
        head1.next = newNode;
 
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = head1;
        Node fast=head1;
        Node slow=head1;
        
        while(fast!=null && fast.next!=null) {
        	slow=slow.next;
        	fast=fast.next.next;
        	
        	if(slow==fast) {
        		break;
        	}
        }
        
        if(fast==null || fast.next==null) {
        	System.out.println("No loop");
        	return;
        }
        
        slow=head1;
        while(slow!=fast) {
        	slow=slow.next;
        	fast=fast.next;
        }
        System.out.println("Cycle exists "+fast.data);
	}

}
