package Heap;

import java.util.PriorityQueue;

import javafx.util.Pair;

//import javafx.util.Pair;

public class kClosestPointToOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] points= {{1,2},{3,4},{6,7}}; int k=2;
		
		//PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> pq=new PriorityQueue<>(); 
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
		for (int[] p : points) {
	        pq.offer(p);
	        //System.out.println(p[0]);
	        if (pq.size() > k) {
	            pq.poll();
	        }
	    }
		
		int[][] res = new int[k][2];
	    while (k > 0) {
	    	//System.out.println(pq.peek());
	        res[--k] = pq.poll();
	        System.out.print(res[k][0]+" ");
	        System.out.println(res[k][1]);
	    }
	    
//	    for(int i=0;i<k;i++) {
//	    	for(int j=0;j<2;j++) {
//	    		System.out.print(res[i][j]);
//	    	}
//	    	System.out.println();
//	    }
//	    
	}

}
