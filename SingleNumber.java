public class LeetCode
{
  /**
   * https://leetcode.com/problems/single-number/
   * problem 136 Single Number
   * Easy
   * Given a non-empty array of integers nums, every element appears
   * twice except for one. Find that single one.
   * You must implement a solution with a linear runtime complexity
   * and use only constant extra space.
   * Array, Bit Manipulation
   */
   public int singleNumber(int[] nums) 
   {
        int result = 0;
        for(int i = 0; i < nums.length; i++)
        {
            result ^= nums[i];
        }
        return result;
   }// end of method singleNumber
}// end of class LeetCode
