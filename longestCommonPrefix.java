import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
    /**
    * https://leetcode.com/problems/longest-common-prefix/
    * Easy
    * problem 14 Longest common prefix 
    * Write a function to find the longest common prefix string
    * amongst an array of strings.
    * If there is no common prefix, return an empty string
    * String
    */
     public String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 0)
        {
                return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length() - 1);
            }   
        }
        return prefix;
    }// end of method longestCommonPrefix
}// end of class LeetCode
