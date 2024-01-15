package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Route_between_Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		int n=7;
		for(int i=1;i<=n+1;i++) {
			adj.add(new ArrayList<Integer>());
		}
		

		adj.get(1).add(2);
		adj.get(2).add(3);
		adj.get(3).add(5);
		adj.get(5).add(7);
		adj.get(2).add(7);
		adj.get(2).add(1);
		adj.get(6).add(4);
		
		Route_between_Nodes rbn =new Route_between_Nodes();
		
		boolean path=rbn.traversalbfs(adj,1,6,n);
		
		System.out.println(path);

	}
	
	boolean traversalbfs(ArrayList<ArrayList<Integer>> adj, int start,int end, int n) {
		
		if(start==end)
			return true;
		
		boolean visited[]=new boolean[n+1]; 
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		visited[start]=true;
		while(!q.isEmpty()) {
			Integer node =q.poll();
			for(Integer it:adj.get(node)) {
				if(visited[it]==false) {
				if(end==it)
					return true;
				q.add(it);
				visited[it]=true;
				}
			}
		}
		
		//System.out.println("Not found path");
		return false;
	}

}
