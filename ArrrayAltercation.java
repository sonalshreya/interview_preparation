package Array;

public class ArrrayAltercation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		
		for(int i=0;i<arr.length-1;i++) {
			if((i%2==0 && arr[i]>arr[i+1])|| (i%2==1 && arr[i]<arr[i+1])) {
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
