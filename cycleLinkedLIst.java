package LinkedLists;

import java.util.HashSet;
import java.util.Set;

public class cycleLinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head1 = new Node(10);
		Node newNode = new Node(15);
        head1.next = newNode;
 
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = head1;
        
        //Solution1:
        
        Node slow=head1;
        Node fast = head1;
        
        while(fast!=null && fast.next!=null) {
        	fast=fast.next.next;
        	 //System.out.println(fast.data);
        	slow=slow.next;
        	if(fast==slow)
        		break;
        }
        
        if(fast==null || fast.next==null) {
        	System.out.println("Cycle not found");
        	return;
        }
        //System.out.println(fast.data);
        slow=head1;
        
        while(fast!=slow) {
        	slow=slow.next;
        	fast=fast.next;
        }
        
        System.out.println(fast.data);
        
        //Solution 2:
        
        Set<Node> set=new HashSet<Node>();
        while(head1!=null) {
        	if(set.contains(head1)) {
        		System.out.println("Cycle exists "+head1.data);
        		return;
        	}
        	else {
        		set.add(head1);
        	}
        	head1=head1.next;
        		
        }
	}

}
