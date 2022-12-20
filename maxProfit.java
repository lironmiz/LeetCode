public class LeetCode
{
  /**
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
   * problem 121 Best Time to Buy and Sell Stock
   * Easy
   * You are given an array prices where prices[i] is the price
   * of a given stock on the ith day. You want to maximize
   * your profit by choosing a single day to buy one stock and
   * choosing a different day in the future to sell that stock.
   * Return the maximum profit you can achieve from this transaction.
   * If you cannot achieve any profit, return 0.
   * Array, Dynamic Programing 
   */
   public int maxProfit(int[] prices)
    {
      int min_val = Integer.MAX_VALUE;
      int max_profit = 0;
      for(int i = 0; i < prices.length; i++)
      {
         if(prices[i] < min_val)
         {
             min_val = prices[i];
         } 
         else if(prices[i] - min_val > max_profit)
         {
             max_profit = prices[i] - min_val;
         }
      } 
      return max_profit; 
    }// end of method maxProfit 
}// end of class LeetCode 
