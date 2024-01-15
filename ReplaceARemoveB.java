package StringQuest;

public class ReplaceARemoveB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[]= {'a','b','c','d'};
		int index=0;int acount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='b') {
				arr[index++]=arr[i];
			}
			if(arr[i]=='a') {
				acount++;
			}
		}
//		System.out.println(index);
//		System.out.println(acount);
		int currIndex=index-1;
		index=index+acount-1;
		//System.out.println(index);
		final int siz=index+1;
		while(currIndex>=0) {
			if(arr[currIndex]=='a') {
				arr[index--]='d';
				arr[index--]='d';
			}
			else {
				arr[index--]=arr[currIndex];
				//System.out.println(index+1);
			}
			--currIndex;
		}
		
		for(int i=0;i<siz;i++) {
			System.out.println(arr[i]);
		}
	}

}
