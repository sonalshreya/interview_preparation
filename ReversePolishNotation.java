//Solve equation A,B,+
//Time Complexity -> O(N)
package stack_and_Queues;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample[]= {"2","3","+","12","*","10","/"};
		
		Stack<Integer> intValue=new Stack<Integer>();
		
		for(String token:sample) {
			if(token.length()==1 && "+_/*".contains(token)) {
				int secondValue=intValue.pop();
				int firstValue=intValue.pop();
				switch(token) {
				case "+": intValue.push(firstValue+secondValue);
				break;
				case "-": intValue.push(firstValue-secondValue);
				break;
				case "*": intValue.push(firstValue*secondValue);
				break;
				case "/": intValue.push(firstValue/secondValue);
				break;
				}
			}
			
			else {
				intValue.push(Integer.parseInt(token));
			}
		}
		
		System.out.println(intValue.pop());
		
		
	}

}
