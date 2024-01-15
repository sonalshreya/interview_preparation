package Array;

public class TheDutchNationalFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,9,18,1,6,79,7,9,9};
		int pivot=9;
		
		int i=0;
		int j=0;
		int smaller=0;
		//int k=arr.length-1;
		System.out.println("***");
		for(i=0;i<arr.length;i++) {
			if(arr[i]<pivot) {
				int temp=arr[i];
				arr[i]=arr[smaller];
				arr[smaller++]=temp;
			}
			
		}
		
		int larger=arr.length-1;
		for(j=arr.length-1;j>=0;j--) {
			if(arr[j]>pivot) {
				int temp=arr[j];
				arr[j]=arr[larger];
				arr[larger--]=temp;
			}
		}
		
		for(int l=0;l<arr.length;l++) {
			System.out.println(arr[l]);
		}
	}

}
