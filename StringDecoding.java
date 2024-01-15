package StringQuest;

public class StringDecoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="4a3b1c6d";int count=0;
		String result="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
				count = count*10+c-'0';
			}
			
			else {
				while(count>0) {
					result=result+c;
					count--;
				}
			}
		}
		
		System.out.println(result);
	}

}
