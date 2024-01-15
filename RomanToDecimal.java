package StringQuest;

import java.util.*;

public class RomanToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character,Integer> mp = new HashMap<Character, Integer>();
		
		mp.put('I', 1);
		mp.put('V', 5);
		mp.put('X', 10);
		mp.put('L', 50);
		mp.put('C', 100);
		mp.put('D', 500);
		mp.put('M', 1000);
		
		String s="XXXXXIIIIIIIII";
		int sum=mp.get(s.charAt(s.length()-1));
		for(int i=s.length()-2;i>=0;i--) {
			if(mp.get(s.charAt(i))< mp.get(s.charAt(i+1)))
				sum-=mp.get(s.charAt(i));
			else
				sum+=mp.get(s.charAt(i));
		}
		
		System.out.println(sum);
	}

}
