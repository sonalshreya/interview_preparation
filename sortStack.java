package stack_and_Queues;
import java.util.*;
public class sortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st =new Stack<Integer>();
		st.push(2);
		st.push(8);
		st.push(5);
		
		sortStack so=new sortStack();
		so.sort(st);
	}
	public void sort(Stack<Integer> st) {
		System.out.println("sorting");
		Stack<Integer> r=new Stack<Integer>();
		while(!st.isEmpty()) {
			int tmp=st.pop();
			while(!r.isEmpty() && r.peek()>tmp) {
				st.push(r.pop());
			}
			r.push(tmp);
			//System.out.println(tmp);
		}
		
		while(!r.isEmpty()) {
			st.push(r.pop());
		}
		System.out.println("sorted stack::");
		//System.out.println(st.peek());
		while(!st.isEmpty()) {
			
			System.out.println(st.pop());
		}
	}

}
