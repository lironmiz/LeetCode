import java.util.HashMap;

/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
   /**
    * https://leetcode.com/problems/reverse-bits/
    * Easy
    * problem 190  Reverse Bits
	  * Reverse bits of a given 32 bits unsigned integer. return its corresponding column number.
    * Divide and Conquer, Bit Manipulation 
    */
    // you need treat n as an unsigned value
    public int reverseBits(int n)
    {
        int result = 0;
        for(int i = 0; i < 32; i++)
        {
            result <<=1;
            result += n%2;
            n>>>=1;
        }
        return result;
    }// end of method reverseBits
}// end of class LeetCode
