/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int size= prices.length,profit=0;
        //Approach-1:
        //int[] arr = new int[size];
        //int max= prices[size-1];
        // for(int i=size-1;i>-1;i--){
        //     if(prices[i]>max) max= prices[i];
        //     arr[i]=max;
        // }
        // max=0;
        // for(int i=0;i<size;i++){
        //     profit=arr[i]-prices[i];
        //     if(max<profit){
        //         max=profit;
        //     }
        // }

        //Approach-2:
        //[7,1,5,3,6,4]
        int buy=prices[0];
        int localProfit=0;
        for(int i=0;i<size;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            localProfit= prices[i]-buy;
            if(profit<localProfit){
                profit=localProfit;
            }
        }
        return profit;
    }
}
// @lc code=end

