import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
    /**https://leetcode.com/problems/two-sum/
    * problem 1 Two Sum 
    * Given an array of integers nums and an integer target,
    * return indices of the two numbers such that they add up to target.
    * example
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    */
    public int[] twoSum(int[] nums, int target)
    {
        // first way brute force algorithm 
        int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }// end of method twoSum
    // second method 
    public int[] twoSum2(int[] nums, int target)
    {
        // second way using a hashmap 
        Map<Integer, Integer> map_nums = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
          int complement = target - nums[i];
          if(map_nums.containsKey(complement))
          {
              return new int[] {map_nums.get(complement), i};
          }
          map_nums.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found!");
    }// end of method twoSum2
}// end of class LeetCode
