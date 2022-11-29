
/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
  /**
  * https://leetcode.com/problems/plus-one/ 
  * problem 66 Plus One
  * Easy
  * You are given a large integer represented as an integer array digits,
  * where each digits[i] is the ith digit of the integer.
  * The digits are ordered from most significant to least significant
  * in left-to-right order. The large integer does not contain any
  * leading 0's. Increment the large integer by one and return
  * the resulting array of digits. 
  */
  public int[] plusOne(int[] digits)
  {
   int n = digits.length;
   for(int i = n - 1; i >= 0; i--)
   {
       if(digits[i] < 9)
       {
           digits[i]++;
           return digits;
       }
       digits[i] = 0;
   }
   int[] number = new int[n + 1];
   number[0] = 1;
   return number;
  }// end of method plusOne
}// end of class LeetCode
 
