
/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
  /**
  * https://leetcode.com/problems/length-of-last-word/description/
  * problem 58 Length of Last Word
  * Easy
  * Given a string s consisting of words and spaces,
  * return the length of the last word in the string. 
  * A word is a maximal  substring consisting of non-space characters only. 
  */
  public int lengthOfLastWord(String s)
  {
      s = s.trim();
      int lastIndex = s.lastIndexOf(' ') + 1;
      return s.length() - lastIndex;
  }// end of method lengthOfLastWord
}// end of class LeetCode
