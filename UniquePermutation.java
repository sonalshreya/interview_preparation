package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class UniquePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aabc";
		
		Set<String> result=new HashSet<String>();
		boolean freq[]=new boolean[str.length()];
		String mid="";
		uniquePerm(str,mid,result,freq);
		for(String s:result) {
			System.out.println(s);
		}
	}
	
	public static void uniquePerm(String str, String mid,Set<String> result,boolean freq[]) {
		if(mid.length()==str.length()) {
			result.add(mid);
			str="";
		}
		
		for(int i=0;i<str.length();i++) {
			if(!freq[i]) {
				freq[i]=true;
				mid=mid+str.charAt(i);
				uniquePerm(str,mid,result,freq);
				mid=mid.substring(0,mid.length()-1);
				freq[i]=false;
			}
		}
	}

}
