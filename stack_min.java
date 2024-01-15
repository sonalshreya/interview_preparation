package stack_and_Queues;
import java.util.*;
public class stack_min extends Stack<Integer>{
	Stack<Integer> s2;
	public stack_min(){
		s2=new Stack<Integer>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public void push(int value) {
		if(value<min()) {
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop(){
		int value=super.pop();
		if(value==min())
			s2.pop();
		return value;
	}
	
	public int min() {
		if(s2.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return s2.peek();
	}

}
