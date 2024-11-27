package leetcode;

public class Stocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int maxProfit(int[] prices) {
	        int ans = 0;
	        int min = prices[0];
	        int max = prices[0];
	        for(int i = 0; i < prices.length; i++){
	            if(prices[i] < max){
	                ans += max - min;
	                min = prices[i];
	                max = prices[i];
	            } else {
	                max = prices[i];
	            }
	        } 
	        ans += max - min;
	        return ans;
	    }
	}

}
