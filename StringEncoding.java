package StringQuest;

public class StringEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str="aaaabbbcdddddd";
//		int count=1;int i=0;
//		String result="";
//		while(i<str.length()-1) {
//			//int x=i;
//			System.out.println(str.charAt(i));
//			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
//				System.out.println("*******"+str.charAt(i));
//				count++;
//				i++;
//			}
//			System.out.println("count&&&:::" + count);
//			result=result+count+str.charAt(i);
//			count=1;i++;
//		}
//		System.out.println(result);
		
		
		//Alternative way:
		
		String str="aaaabbbcdddddd";
		String result="";int count=1;
		for(int i=1;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)!=str.charAt(i-1)) {
				result=result+count+str.charAt(i-1);
				count=1;
			}
			else {
				count++;
			}
		}
		
		System.out.println(result);
	}

}
