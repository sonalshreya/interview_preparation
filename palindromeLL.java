package LinkedLists;
import java.util.*;
public class palindromeLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=new Node(7);
		Node temp=head;
		temp.next=new Node(1);
		temp=temp.next;
		temp.next=new Node(2);
		temp=temp.next;
		temp.next=new Node(1);
		temp=temp.next;
		temp.next=new Node(7);

		
		Node fast=head;
		Node slow=head;
		
		Stack<Integer> st = new Stack<Integer>();
		
		while(fast!=null && fast.next!=null) {
			st.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		
		if(fast!=null) {
			slow=slow.next;
		}
		while(slow!=null) {
			if(st.pop()==slow.data) {
				slow=slow.next;
			}
			else {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Is a palindrome");
	}

}
