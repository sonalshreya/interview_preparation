package stack_and_Queues;

import java.util.Stack;

public class SearchPostingLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PostingList pl=new PostingList('a',-1);
		pl.next=new PostingList('b',-1);
		pl.next.next=new PostingList('c',-1);
		pl.next.next.next=new PostingList('d',-1);
		pl.jump=pl.next.next;
		pl.next.jump=pl.next.next.next;
		pl.next.next.jump=pl.next;
		
		pl.next.next.next.jump=pl.next.next.next;
		
		Stack<PostingList> st=new Stack<PostingList>();
		
		st.add(pl);
		
		while(!st.isEmpty()) {
			PostingList val=st.pop();
			if(val.order==-1) {
				val.order=val.order+1;
				System.out.println(val.ch);
				if(val.next!=null) {
					st.add(val.next);
				}
				if(val.jump!=null) {
					st.add(val.jump);
				}
			}
		}
	}

}

class PostingList{
	
	char ch;
	PostingList jump;
	PostingList next;
	int order;
	
	PostingList(char ch,int order){
		this.ch=ch;
		this.jump=null;
		this.next=null;
		this.order=order;
	}
}
