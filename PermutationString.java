package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		List<Character> ch =new ArrayList<Character>();
		List<ArrayList<Character>> result = new ArrayList<ArrayList<Character>>();
		boolean freq[]=new boolean[str.length()];
		perm(str,ch,result,freq);
		for(List<Character> ar:result) {
			for(char c:ar) {
				System.out.print(c);
			}
			System.out.println("\n");
		}
	}
	
	public static void perm(String str, List<Character> list, List<ArrayList<Character>> result, boolean freq[]) {
		
		if(list.size()==str.length()) {
			result.add(new ArrayList(list));
		}
		for(int i=0;i<str.length();i++) {
			if(!freq[i]) {
				freq[i]=true;
				list.add(str.charAt(i));
				perm(str,list,result,freq);
				list.remove(list.size()-1);
				freq[i]=false;
			}
		}
	}

}
