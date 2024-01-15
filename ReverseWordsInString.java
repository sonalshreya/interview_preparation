package StringQuest;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Bob likes Alice";
		
		StringBuilder sb= new StringBuilder(s);
		sb=sb.reverse();String result="";
		s=sb.toString()+" ";
		int i=0;String x="";
		while(i<s.length()) {
			
			if(s.charAt(i)!=' ') {
				x=x+s.charAt(i++);
			}
			else {
				i++;
				StringBuilder sbr= new StringBuilder(x);
				sbr=sbr.reverse();
				result=result+sbr.toString()+" ";
				x="";
			}
		}
		
		System.out.println(result.trim());
	}

}
