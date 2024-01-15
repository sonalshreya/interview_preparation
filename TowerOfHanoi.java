package DynamicProgramming;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		toh(n,'A','B','C');
	}

	public static void toh(int n, char source, char destination, char buffer) {
		if(n<=0)
			return;
		toh(n-1,source,buffer,destination);
		System.out.println(source+"---"+destination);
		toh(n-1,buffer,destination,source);
		
	}
}
 