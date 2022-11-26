/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
  /**
    * https://leetcode.com/problems/search-insert-position/
    * problem 35 Search Insert Position
    * Easy
    * Given a sorted array of distinct integers and a target value,
    * return the index if the target is found.
    * If not, return the index where it would be if it were inserted
    * in order. You must write an algorithm with O(log n)
    * runtime complexity.
    * binary search
    */
    public int searchInsert(int[] nums, int target)
    {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r)
        {
            int midIndex = (l + r)/2;
            if(nums[midIndex] == target)
            {
                return midIndex;
            }
            else if(nums[midIndex] > target)
            {
                r = midIndex -1;
            }
            else
            {
                l = midIndex + 1;
            }
        }
        return l;
    }// end of method searchInsert
}// end of class LeetCode
