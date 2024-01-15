//Time Complexity - O(N)
//Space Complexity - O(1)
package LinkedLists;

public class ListPivoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node(1);
		head.next=new Node(12);
		head.next.next=new Node(31);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		int k=5;
		
		Node firstList = new Node(0);
		Node midList = new Node(0);
		Node lastList = new Node(0);
		
		Node tempfirstList=firstList;
		Node tempmidList=midList;
		Node templastList=lastList;
		
		Node start=head;
		
		while(start!=null) {
			if(start.data<k) {
				tempfirstList.next=start;
				tempfirstList=tempfirstList.next;
			}
			else if(start.data==k) {
				tempmidList.next=start;
				tempmidList=tempmidList.next;
			}
			else if(start.data>k) {
				templastList.next=start;
				templastList=templastList.next;
			}
			start=start.next;
			
		}
		
		tempfirstList.next=midList.next;
		tempmidList.next=lastList.next;
		templastList.next=null;
		
		firstList=firstList.next;
		while(firstList!=null) {
			System.out.println(firstList.data);
			firstList=firstList.next;
		}
	}

}
