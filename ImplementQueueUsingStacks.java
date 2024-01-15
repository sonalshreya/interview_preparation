//TC-> O(m)
package stack_and_Queues;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	static Stack<Integer> enq=new Stack<Integer>();
	static Stack<Integer> deq=new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementQueueUsingStacks.push(2);
		ImplementQueueUsingStacks.push(3);
		ImplementQueueUsingStacks.push(4);
		ImplementQueueUsingStacks.push(5);
		System.out.println(ImplementQueueUsingStacks.pop());
		ImplementQueueUsingStacks.push(7);
		ImplementQueueUsingStacks.pop();
		ImplementQueueUsingStacks.pop();
		ImplementQueueUsingStacks.pop();
		System.out.println(ImplementQueueUsingStacks.pop());
		
	}
	
	public static void push(int i) {
		enq.push(i);
	}
	
	public static int pop() {
		if(!deq.isEmpty()) {
			return deq.pop();
		}
		
		else {
			while(!enq.isEmpty()) {
				deq.push(enq.pop());
			}
			
			return deq.pop();
		}
	}

}
