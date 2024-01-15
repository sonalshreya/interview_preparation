package Array;

import java.util.*;

public class firstnRowsPascalTriangle {

	public static void main(String[] args) {
		
		List<List<Integer>> pascal=new ArrayList<List<Integer>>();
		int n=5;int p=1;
		for(int i=0;i<n;i++) {
			List<Integer> curr=new ArrayList<Integer>();
			
			for(int j=0;j<=i;j++) {
				if(j>0 && j<i) {
					curr.add(pascal.get(i-1).get(j-1)+ pascal.get(i-1).get(j));
				}
				else
					curr.add(1);
			}
			pascal.add(curr);
			
		}
		
		for(List<Integer> l:pascal ) {
			for(Integer i:l) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
