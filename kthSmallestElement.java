//min heap is in which min is on the top of the list
//max heap is in which max is on the top of the list
package Heap;

import java.util.PriorityQueue;

public class kthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,6,8,1,4};
		int k=2;
		PriorityQueue<Integer> p=new PriorityQueue<>(k+1,(a,b)->b-a);
		
		for(int i=0;i<arr.length;i++) {
			p.add(arr[i]);
			if(p.size()==k+1)
			p.poll();
		}
		
		System.out.println(p.peek());
		
		for(Integer it:p) {
			System.out.println(it);
		}
	}

}
