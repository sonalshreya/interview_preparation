package Array;

public class AdvancingThroughAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,0,0,2,0,1};
		
		int reach=0;
		int last=a.length;
		
		for(int i=0;i<=reach && reach<last;i++) {
			reach=Math.max(reach, i+a[i]);
		}
		
		System.out.println(reach>=last);

	}

}
