/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  */

/* Brute force Approach
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}
*/
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            minPrice = Math.min(minPrice,price);
            int profit = price - minPrice;
            maxProfit  = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}
