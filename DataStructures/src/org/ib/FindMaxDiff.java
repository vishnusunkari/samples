package org.ib;


/*
 *	[4, 7, 2, 3, 6, 1]
 *	[4, 3, 3, 2, 5, 5, 3, 4, 2..]
 */

public class FindMaxDiff {

	public static void main(String[] args) {
			int [] stockPrices = {4, 7, 2, 3, 6, 1};
			System.out.println("Max Profit : " + getMaxProfit(stockPrices));
	}
	
	public static int getMaxProfit(int[] a) {
		int length = a.length;
		int max = 0, max1 = 0;		
	    int buyIndex = 0;
	    int sellIndex = 1;    
	    int bestBuyIndex = buyIndex;
		int bestSellIndex = sellIndex;
		for(int i=1; i< length-1; i++) {                      
	        max1 = a[sellIndex]-a[buyIndex];
			if(max1 > max && sellIndex > buyIndex)  {
				if((a[buyIndex] < a[bestBuyIndex]) && buyIndex < bestSellIndex) {
					max = max1;
					bestBuyIndex = buyIndex;
					buyIndex++;
				} else if((a[sellIndex] > a[bestSellIndex]) && sellIndex > bestBuyIndex){
					max = max1;
					bestSellIndex = sellIndex;
					sellIndex++;					
				}
			} else {
				buyIndex++;
				sellIndex++;
			}
		}
		return max;		

	}

}
