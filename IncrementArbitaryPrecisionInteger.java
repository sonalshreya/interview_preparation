package Array;

import java.util.*;

public class IncrementArbitaryPrecisionInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> alist=new ArrayList<Integer>();
		alist.add(9);
		alist.add(9);
		alist.add(9);
		if(alist.get(alist.size()-1)<9) {
			alist.set(alist.size()-1, alist.get(alist.size()-1)+1);
			
		}

		else {
			alist.set(alist.size()-1, alist.get(alist.size()-1)+1);
			int n=alist.size()-1;
			for(int i=n;i>0 && alist.get(i)==10;i--) {
				alist.set(i,0);
				alist.set(i-1, alist.get(i-1)+1);
			}
			
			if(alist.get(0)==10) {
				alist.set(0, 0);
				alist.add(0,1);
			}
		}
		//System.out.println(alist.size());
		for(Integer i:alist)
		System.out.println(i);
	}

}
