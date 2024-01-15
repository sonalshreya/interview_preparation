//A child is running up a staircase and can hop either 1 step, 2 step or 3 step
package DynamicProgramming;

import java.util.Arrays;

public class TripleSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int memo[]=new int[n+1];
		Arrays.fill(memo, -1);
		int result=count(n,memo);
		System.out.println(result);
	}
	
	public static int count(int n, int[] memo) {
		if(n<0)
			return 0;
		else if(n==0)
			return 1;
		else if(memo[n]>-1)
			return memo[n];
		else {
			memo[n]=count(n-3,memo)+count(n-2,memo)+count(n-1,memo);
			return memo[n];
		}
	}

}
