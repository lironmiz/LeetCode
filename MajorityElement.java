import java.util.HashMap;

/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
   /**
    * https://leetcode.com/problems/majority-element/
    * Easy
    * problem 169 Majority Element
    * Given an array nums of size n, return the majority element.
    * The majority element is the element that appears more than ⌊n / 2⌋ times.
    * You may assume that the majority element always exists in the array.
    * Array, Hash Table Divide and Conquer, Sorting, Counting 
    */
    public int majorityElement(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(!map.containsKey(num))
            {
                map.put(num, 1);
            }
            else
            {
                map.put(num, map.get(num) + 1);
            }
            if(map.get(num) > nums.length / 2)
            {
                return num;
            }
        }
        return 0;
    }
}// end of class LeetCode
    
