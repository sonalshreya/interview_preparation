//unique elements in sorted array
package DynamicProgramming;

public class MagicIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,1,3,5,7,61,37,13};
		int low=0;
		int high=arr.length-1;
		MagicIndex m=new MagicIndex();
		
		int result=m.magicNumber(arr,low,high);
		System.out.println(result);
	}
	
	public int magicNumber(int arr[],int low,int high) {
		
		int result=0;
		int mid=low+(high-low)/2;
		if(low>high)
			return -1;
			if(arr[mid]==mid) {
				return mid;
			}
			else if(arr[mid]<mid) {
				return magicNumber(arr,mid+1,high);
			}
			else
				return magicNumber(arr,low,mid-1);
			
		
	}

}
