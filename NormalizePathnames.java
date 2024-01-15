package stack_and_Queues;

import java.util.Stack;

public class NormalizePathnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalPath="sc//./../tc/awk/././";
		
		Stack<String> st=new Stack<String>();
		if(originalPath.startsWith("/")) {
			st.add("/");
		}
		String tokens[]=originalPath.split("/");
		
		for(String value:tokens) {
			
			if(value.equals("..")) {
				if(st.isEmpty() || st.peek().equals("..")) {
					st.push(value);
				}
				else {
					if(st.peek().equals("/")) {
						System.out.println("Wrong path");
						return;
					}
					System.out.println(st.peek());
					st.pop();
				}
				
			}
			else if(!value.equals(".") && !value.isEmpty()) {
				st.push(value);
			}
			
		}
		
		String result=st.pop();
		
		while(!st.isEmpty()) {
			
			if(st.peek()!="/") {
				result="/"+result;
			}
			result=st.pop()+result;
			
		}
		
		System.out.println(result);
	}

}
