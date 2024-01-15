package stack_and_Queues;
import java.util.*;
public class Queue_via_Stacks {

	Stack<Integer> newStack = new Stack<Integer>();
	Stack<Integer> oldStack = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_via_Stacks q =new Queue_via_Stacks();
		q.add(2);
		q.add(4);
		q.add(6);
		q.add(8);
		q.remove();
		q.peek();
		q.add(89);
		q.remove();
		
	}
	
	public void add(int val) {
		System.out.println("Add "+val);
		newStack.add(val);
	}
	
	public void shiftStacks() {
		if(oldStack.isEmpty()) {
			while(!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}
		}
	}
	
	public int remove() {
		shiftStacks();
		int val=oldStack.pop();
		System.out.println("pop "+val);
		return val;
	}
	
	public int peek() {
		shiftStacks();
		int val=oldStack.peek();
		System.out.println("peek "+val);
		return val;
	}

}
