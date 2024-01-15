package StringQuest;

import java.util.*;

public class mnemonics {

	public static final String[] mapping= {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="234567";
		char partial[]=new char[str.length()];
		List<String> memo=new ArrayList<String>();
		
		calculaterecurv(str,0,partial,memo);
	}
	
	public static void calculaterecurv(String phoneNumber,int digit, char[] partial, List<String> memo) {
		
		if(digit==phoneNumber.length()) {
			System.out.println("******");
			memo.add(new String(partial));
			System.out.println(new String(partial));
		}
		
		else {
			
			for(int i=0;i<mapping[phoneNumber.charAt(digit)-'0'].length();i++) {
				
				char c=mapping[phoneNumber.charAt(digit)-'0'].charAt(i);
				partial[digit]=c;
				calculaterecurv(phoneNumber,digit+1,partial,memo);
				
			}
		}
	}

}
//https://repost.aws/knowledge-center