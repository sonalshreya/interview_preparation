package Array;

public class BuyAndSellStockOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {310,315,275,295,260,270,290,255,250};
		int min_price=Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int i=0;i<arr.length;i++) {
			maxProfit=Math.max(maxProfit,arr[i]-min_price);
			min_price=Math.min(min_price, arr[i]);
		}
		
		System.out.println(maxProfit);
	}

}
