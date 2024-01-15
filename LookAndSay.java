package StringQuest;

public class LookAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seq="1";
		String result="";
		int n=7;
		int x=0;
		for(int i=1;i<n;i++) {
			result="";
			x=seq.length();int j=0;
			while(j<x) {
				int count=1;
				while(j+1<x && seq.charAt(j)==seq.charAt(j+1)) {
					count++;j++;
				}
				result+=Integer.toString(count)+seq.charAt(j);j++;
				//seq=result;
				
			}
			seq=result;
			System.out.println(result);
		}
		
		System.out.println(result);
	}

}
