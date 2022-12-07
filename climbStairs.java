/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
    /**
    * https://leetcode.com/problems/climbing-stairs/description/
    * problem 70 Climbing Stairs
    * Easy
    * You are climbing a staircase. It takes n steps to reach the top.
    * Each time you can either climb 1 or 2 steps.
    * In how many distinct ways can you climb to the top?
    * Memoizaton and Dynamic Programming
    */
    public int climbStairs(int n)
    {
        if( n == 1)
        {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i<=n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }// end of method climbStairs
}// end of method LeetCode 
