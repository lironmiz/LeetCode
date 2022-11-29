**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
    /**
    * https://leetcode.com/problems/add-binary/
    * problem 67 Add Binary
    * Easy
    * Given two binary strings a and b, return their sum as a binary string.
    * bit manipulation, math, string
    */
     public String addBinary(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while(i >= 0 || j >= 0)
        {
            int sum = carry;
            if(i >= 0)
            {
                sum += a.charAt(i) - '0';
            }
            if( j >= 0)
            {
                sum += b.charAt(j) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if(carry != '0')
        {
            sb.append(carry);
        }

        return sb.reverse().toString();       
    }// end of method addBinary
}// end of class LeetCode
    
