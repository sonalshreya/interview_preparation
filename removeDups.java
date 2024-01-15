package LinkedLists;
import java.util.*;
public class removeDups {
	
	public static void main(String[] args) {
		Node head=new Node(1);
		Node temp=head;
		temp.next=new Node(9);
		temp=temp.next;
		temp.next=new Node(1);
		temp.next.next = new Node(9);
		
		
		// Remove Duplicates
		Node prev=null;
		Set<Integer> set = new HashSet<Integer>();
		Node ntemp=head;
		while(ntemp!=null) {
			if(set.contains(ntemp.data)) {
				prev.next=ntemp.next;
				
			}
			else {
				set.add(ntemp.data);
				prev=ntemp;
			}
			
			ntemp=ntemp.next;
		}
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}

}

class Node{
	Node next;
	int data;
	
	public Node(int d){
		data=d;
	}
}
