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
    * https://leetcode.com/problems/palindrome-number/
    * Easy
    * problem 9 Palindrome Number
    * Given an integer x, return true if x is a palindrome and false otherwise.
    * Math
    */
    public boolean isPalindrome(int x) 
    {
        int a, b = 0, c = x;
        if ( x == 0)
        {
            return true;
        }

        if( x < 0 || x % 10 == 0)
        {
            return false;
        }

        while(c > 0)
        {
            a = c % 10;
            b = b * 10 + a;
            c /= 10;    
        }
        if(b == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }// end of method isPalindrome
}// end of class LeetCode
