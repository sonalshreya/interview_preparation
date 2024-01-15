package Array;

import java.util.*;

public class EmurateAllPrimesToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		boolean notPrime[]=new boolean[n+1];
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=n;i++) {
			if(notPrime[i]==false)
				list.add(i);
		for(int j=2;j*i<=n;j++) {
			notPrime[i*j]=true;
		}
		}
		
		for(Integer i:list) {
			System.out.println(i);
		}
	}

}
