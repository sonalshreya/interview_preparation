package LinkedLists;

public class IntersectionNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head1 = new Node(10);
        Node head2 = new Node(3);
 
        Node newNode = new Node(6);
        head2.next = newNode;
 
        newNode = new Node(9);
        head2.next.next = newNode;
 
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
 
        newNode = new Node(30);
        head1.next.next = newNode;
 
        head1.next.next.next = null;
        
        Node temp=head1; Node tail1=null;int l1=0;
        while(temp!=null) {
        	tail1=temp;
        	temp=temp.next;
        	l1++;
        }
        
         temp=head2; Node tail2=null;int l2=0;
        while(temp!=null) {
        	tail2=temp;
        	temp=temp.next;
        	l2++;
        }
        
        if(tail1!=tail2) {
        	System.out.println("The nodes do not intersect");
        	return;
        }
        
        if(l1>l2) {
        	while(l1!=l2) {
        		head1=head1.next;
        		l1--;
        	}
        }
        else if(l2>l1){
        	while(l2!=l1) {
        		head2=head2.next;
        		l2--;
        	}
        }
        
        while(head1!=head2) {
        	head1=head1.next;
        	head2=head2.next;
        }
        System.out.println("Intersecting Node "+head1.data);

	}

}
