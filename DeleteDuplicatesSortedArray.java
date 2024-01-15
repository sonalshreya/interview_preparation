package Array;

public class DeleteDuplicatesSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,5,5,7,11,11,11,13};
		
		int newIndex=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]!=arr[i]) {
				arr[newIndex++]=arr[i];
			}
		}
		
		for(int j=0;j<newIndex;j++) {
			System.out.println(arr[j]);
		}
	}

}
