package StringQuest;

public class ConvertStringToIntAndIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result=convertIntToString(-123);
		System.out.println(result);
		
		int t=convertStringToInt("-234");
		System.out.println(t);
	}
	
	
	public static String convertIntToString(int x) {
		String r="";String sign="";
		if(x<0) {
			sign="-";
			x=Math.abs(x);
		}
		while(x>0) {
			int d=x%10;
			r=d+r;
			x=x/10;
		}
		
		r=sign+r;
		return r;
	}
	
	public static int convertStringToInt(String x) {
		int t=0;
		for(int i=x.charAt(0)=='-'?1:0;i<x.length();i++) {
			t=t*10+(x.charAt(i)-'0');
		}
		
		return x.charAt(0)=='-'?-t:t;
	}
	

}
