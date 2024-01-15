package stack_and_Queues;

import java.util.Stack;

public class Max_API {

	static Stack<MaxCachedValue> st=new Stack<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> normal=new Stack<Integer>();
		
		Max_API.push(5);
		Max_API.push(20);
		Max_API.push(3);
		int ma=Max_API.maximum();
		int popped=Max_API.pop();
		System.out.println(ma);
		System.out.println(popped);
		//Max_API.push(23);
		Max_API.pop();
		int sma=Max_API.maximum();
		System.out.println(sma);
	}
	
	public static boolean empty() {
		return st.isEmpty();
	}
	
	public static Integer maximum() {
		if(empty()) {
			throw new IllegalStateException("max:empty");
		}
		return st.peek().max;
	}
	
	public static Integer pop() {
		if(empty()) {
			throw new IllegalStateException("pop:empty");
		}
		return st.pop().element;
	}
	
	public static void push(Integer x) {
		st.add(new MaxCachedValue(x,Math.max(x, empty()?x:maximum())));
	}

}

class MaxCachedValue{
	Integer element;
	Integer max;
	
	MaxCachedValue(Integer element,Integer max){
		this.element=element;
		this.max=max;
	}
}
