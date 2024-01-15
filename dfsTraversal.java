package TreesAndGraphs;

import java.util.ArrayList;

public class dfsTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> result = new ArrayList<Integer>();
		
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
		adj.get(3).add(2);
		adj.get(5).add(3);
		adj.get(7).add(5);
		adj.get(7).add(2);
		adj.get(4).add(6);
		adj.get(6).add(4);
		
		
		
		dfsTraversal b=new dfsTraversal();
		result=b.dfsOfGraph(n,adj);
		
		
		for(Integer in: result) {
			System.out.println(in);
		}
	}
	
	ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
		ArrayList<Integer> storeDfs = new ArrayList<Integer>();
		boolean vis[]=new boolean[V+1];
		for(int i=1;i<=V;i++) {
			if(vis[i]==false) {
				dfs(i,vis,adj,storeDfs);
			}
		}
		return storeDfs;
	}
	
	public void dfs(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> store) {
		store.add(i);
		vis[i]=true;
		for(Integer it: adj.get(i)) {
			if(vis[it]==false) {
				dfs(it,vis,adj,store);
			}
		}
	}

}
