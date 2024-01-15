//Not distinct elements in sorted array
package DynamicProgramming;

public class MagicElementsNotDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-10,-5,2,2,2,3,4,5,9,12,13};
		
		int low=0;
		int high=arr.length-1;
		
		MagicElementsNotDistinct m=new MagicElementsNotDistinct();
		int result = m.magicNumber(arr,low,high);
		
		System.out.println(result);
	}
	
	int magicNumber(int arr[],int low,int high) {
		if(low>high)
			return -1;
		
		int mid=low+(high-low)/2;
		
		if(mid==arr[mid]) {
			return mid;
		}
		
		int leftIndex=Math.min(mid-1, arr[mid]);
		int left=magicNumber(arr,low,leftIndex);
		if(left>=0)
			return left;
		
		int rightIndex=Math.max(mid+1, arr[mid]);
		int right=magicNumber(arr,rightIndex,high);
		return right;
		
	}

}
