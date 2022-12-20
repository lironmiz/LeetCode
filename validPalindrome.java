public class LeetCode
{
  /**
   * https://leetcode.com/problems/valid-palindrome/
   * problem 125 Valid Palindrome
   * Easy
   * A phrase is a palindrome if, after converting all uppercase letters
   * into lowercase letters and removing all non-alphanumeric characters,
   * it reads the same forward and backward.
   * Alphanumeric characters include letters and numbers. Given a string s,
   * return true if it is a palindrome, or false otherwise.
   * Two Pointers, String 
   */
   public boolean isPalindrome(String s)
   {
       String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
       String rev = new StringBuffer(actual).reverse().toString();
       return actual.equals(rev);
   }// end of method isPalindrome
}// end of class LeetCode
