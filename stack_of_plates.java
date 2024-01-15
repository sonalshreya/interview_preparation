package stack_and_Queues;
import java.util.*;
public class stack_of_plates {
 
	ArrayList<Stack> stacks=new ArrayList<Stack>();
	int capacity=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_of_plates st=new stack_of_plates();
		//st.pop();//test exception
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.pop();
		st.pop();
		

	}
	public Stack getLastStack() {
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
	}
	
	
	public void push(int v) {
		Stack last=getLastStack();
		if(last!=null && (last.size()<capacity)) {
			System.out.println("push in stack "+v);
			last.push(v);
		}
		else {
			Stack<Integer> stack =new Stack<Integer>();
			System.out.println("push:: "+v);
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public int pop() {
		Stack<Integer> last=getLastStack();
		if(last==null) throw new EmptyStackException();
		
		int v=last.pop();
		System.out.println("pop:: "+v);
		if(last.isEmpty()) {
			stacks.remove(stacks.size()-1);
		}
		return v;
	}
	

}
