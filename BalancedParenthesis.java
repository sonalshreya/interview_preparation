package stack_and_Queues;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paren="{(])}";
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0; i<paren.length();i++) {
			char ch=paren.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}
			else {
				char open=st.pop();
				if(ch==')' && (open=='{' || open=='[')) {
					System.out.println("Not balanced ");
					return;
				}
				else if(ch=='}' && (open=='(' || open =='[')) {
					System.out.println("Not balanced ");
					return;
				}
				
				else if(ch==']' && (open=='(' || open =='{')) {
					System.out.println("Not balanced ");
					return;
				}
			}
		}
		if(!st.isEmpty())
			System.out.println("Not balanced");
		else
			System.out.println("Is balnced");
	}

}
