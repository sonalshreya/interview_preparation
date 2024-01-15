package StringQuest;

public class palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="able was i,ere i saw elba";
		int i=0;
		int j=s.length()-1;
		boolean flag=true;
		while(i<j) {
			if(!Character.isLetterOrDigit(s.charAt(i)) && i<j)
				i++;
			if(!Character.isLetterOrDigit(s.charAt(j))&& i<j)
				j--;
			
			if(s.charAt(i++)!=s.charAt(j--)) {
				flag=false;
				break;
			}
				
		}
		
		if(flag==true) {
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
