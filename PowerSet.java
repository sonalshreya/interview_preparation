//PowerSet, Set, UniqueSet
package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip="aac";
		String op="";
		ArrayList<String> al = new ArrayList<String>();
		Set<String> hs = new HashSet<String>();
		solve(ip,op,al,hs);
		System.out.println("Subset");
		for(String a:al) {
			System.out.println(a);
		}
		
		System.out.println("\n Unique Subset");
		for(String a:hs) {
			System.out.println(a);
		}
	}
	
	public static void solve(String ip, String op, ArrayList<String> al,Set<String> hs) {
		if(ip.length()==0) {
			//System.out.println(op);
			al.add(op);
			hs.add(op);
			return;
		}
		String op1=op;
		String op2=op;
		
		op2=op+ip.substring(0,1);
		ip=ip.substring(1);
		
		solve(ip,op1,al, hs);
		solve(ip,op2,al,hs);
	}

}
