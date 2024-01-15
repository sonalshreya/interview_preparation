package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class BalancedParen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		List<String> result=new ArrayList<String>();
		int c=n;
		int o=n;
		String balanced="";
		paren(balanced,c,o,result);
		
		for(String s:result) {
			System.out.println(s);
		}
	}
	
	public static void paren(String balanced,int c,int o,List<String> result) {
		if(c==0 && o==0) {
			result.add(balanced);
			
			return;
		}
		if(o!=0) {
			paren(balanced+"(",c,o-1,result);
		}
		if(c>o) {
			
			paren(balanced+")",c-1,o,result);
		}
		
		
	}

}
