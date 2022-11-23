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
    * https://leetcode.com/problems/longest-substring-without-repeating-characters/
    * Medium 
    * problem 3 Longest Substring without repeating characters
    * Given a string s, find the length of the longest
    * substring without repeating characters.
    * sliding window
    */
    public int lengthOfLongestSubstring(String s)
    {
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet();

        while( bPointer < s.length())
        {
            if(!hashSet.contains(s.charAt(bPointer)))
            {
                hashSet.add(s.charAt(bPointer));
                bPointer++;
                max = Math.max(hashSet.size(), max);
            }
            else
            {
              hashSet.remove(s.charAt(aPointer));
              aPointer++;
            }
        }
        return max;
    }// end of method lengthOfLongestSubstring
}// end of class LeetCode
