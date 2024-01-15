package LinkedLists;

public class SumLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=new Node(7);
		Node temp=head;
		temp.next=new Node(1);
		temp=temp.next;
		temp.next=new Node(6);

		Node head2=new Node(5);
		head2.next=new Node(9);
		head2.next.next=new Node(2);
		
		//Solution
		int p1=0;int sum1=0;
		while(head!=null) {
			sum1=head.data*(int)(Math.pow(10, p1))+sum1;
			//System.out.println(sum1);
			p1++;
			head=head.next;
		}
		//System.out.println(p1);
		
		int p2=0;int sum2=0;
		while(head2!=null) {
			sum2=head2.data*(int)(Math.pow(10, p2))+sum2;
			//System.out.println(sum2);
			p2++;
			head2=head2.next;
		}
		//System.out.println(p2);
		
		sum1+=sum2;
		Node result=null;Node headh=null;
		while(sum1!=0) {
			int d=sum1%10;
			if(headh==null) {
				result=new Node(d);
				headh=result;
				
			}
			else {
				result.next=new Node(d);
				result=result.next;
			}
			sum1=sum1/10;
		}
		//System.out.println(headh.data);
		while(headh!=null) {
			System.out.println(headh.data);
			headh=headh.next;
		}
		
	}

}
