package DynamicProgramming;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int demons[]= {25,10,5,1};
		int total=77;
		
		int ways=countWays(demons,total,0);
		System.out.println(ways);
	}
	
	public static int countWays(int demons[],int total,int index) {
		int coin=demons[index];
		if(index==demons.length-1) {
			int remaining=total% coin;
			return remaining==0?1:0;
		}
		
		int ways=0;
		for(int i=0;i<=total;i+=coin) {
			ways+=countWays(demons,total-i,index+1);
		}
		return ways;
		
	}

}
