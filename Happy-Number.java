
/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
   /**
    * https://leetcode.com/problems/happy-number/
    * Easy
    * problem 202 Happy Number
    * Write an algorithm to determine if a number n is happy.
    * A happy number is a number defined by the following process:
    * Starting with any positive integer, replace the number by the sum of the squares of its digits.
    * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    * Those numbers for which this process ends in 1 are happy.
    * Return true if n is a happy number, and false if not.
    * Hash Table, Math, Two Pointers
    */
     public boolean isHappy(int n)
    {
        Set<Integer> numbersSet = new HashSet<>();

        while( n != 1)
        {
            int sum = 0;
            int curr = n;

            while( curr != 0)
            {
                int rem = curr % 10;
                sum += rem * rem;
                curr /= 10;
            }

            if(numbersSet.contains(sum))
            {
                return false;
            }
            n = sum;
            numbersSet.add(n);
        }
        return true;
    }
)// end of class LeetCode
