package Array;

import java.util.*;

public class BuyAndSellAStockTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {310,315,275,295,260,270,290,255,250};
		
		int max_profit=0;
		int minPrice=Integer.MAX_VALUE;
		
		List<Integer> firstBuy=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			minPrice=Math.min(arr[i], minPrice);
			max_profit=Math.max(arr[i]-minPrice, max_profit);
			firstBuy.add(max_profit);
		}
		int maxPriceSoFar=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>0;i--){
			maxPriceSoFar=Math.max(maxPriceSoFar, arr[i]);
			max_profit=Math.max(max_profit,maxPriceSoFar-arr[i]+firstBuy.get(i-1));
		}
		System.out.println(max_profit);
	}

}	
