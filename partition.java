//Do again ******

package LinkedLists;
import java.util.*;
public class partition {
	
	public static void main(String[] args) {
		Node node=new Node(1);
		Node temp=node;
		temp.next=new Node(9);
		temp=temp.next;
		temp.next=new Node(2);
		Node mid=temp.next;
		temp=temp.next;
		temp.next=new Node(3);
		
		temp.next.next = new Node(5);
		int target=5;
		Node Head=node;
		Node Tail=node;
		
		while(node!=null) {
			
			Node tep=node.next;
			
			if(node.data<target) {
				node.next=Head;
				Head=node;
			}
			else {
				Tail.next=node;
				Tail=node;
			}
			
			node=tep;
		}
		
		Tail.next=null;
		
		while(Head!=null) {
			System.out.println(Head.data);
			Head=Head.next;
		}
	}

}
