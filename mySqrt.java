 /**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
    /**
    * https://leetcode.com/problems/plus-one/ 
    * problem 69 Sqrt(x)
    * Easy
    *Given a non-negative integer x, return the square root of x
    *rounded down to the nearest integer.
    *The returned integer should be non-negative as well.
    *You must not use any built-in exponent function or operator.
    *Binary Search
    */
    public int mySqrt(int x)
    {
        if ( x < 2)
        {
            return x;
        }

       long num;
       int mid;
       int left = 2;
       int right = x/2;

       while(left <= right)
       {
            mid = (left + right) / 2;
            num = (long) mid * mid;
            if(num > x)
            {
                right = mid - 1;
            }
            else if(num < x)
            {
               left = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return right;
    }// end of method mySqrt
}// end of class LeetCode 
