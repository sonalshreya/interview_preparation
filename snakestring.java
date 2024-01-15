package StringQuest;

public class snakestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Hello World!";String result="";
		for(int i=1;i<s.length();i=i+4) {
			//System.out.println(s.charAt(i));
			result+=s.charAt(i);
		}
		for(int j=0;j<s.length();j=j+2) {
			result+=s.charAt(j);
		}
		for(int i=3;i<s.length();i=i+4) {
			//System.out.println(s.charAt(i));
			result+=s.charAt(i);
		}
		System.out.println(result);
	}

}
