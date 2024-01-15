package TreesAndGraphs;
import java.util.*;
public class bfsTraversal {

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
		
		bfsTraversal b=new bfsTraversal();
		result=b.bfs(n,adj);
		
		for(Integer in: result) {
			System.out.println(in);
		}
	}
	
	ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> bfs=new ArrayList<Integer>();
		boolean vis[] = new boolean[V+1];
		
		for(int i=1;i<=V;i++) {
			if(vis[i]==false) {
				Queue<Integer> q=new LinkedList<Integer>();
				q.add(i);
				vis[i]=true;
				while(!q.isEmpty()) {
					Integer node=q.poll();
					bfs.add(node);
					for(Integer it:adj.get(node)) {
						if(vis[it]==false) {
							vis[it]=true;
							q.add(it);
						}
					}
				}
			}
		}
		return bfs;
	}

}
