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
    * https://leetcode.com/problems/valid-parentheses/
    * problem 20 Valid Parenthess
    * Easy
    * Given a string s containing just the characters
    * '(', ')', '{', '}', '[' and ']', determine if the input string
    * is valid. An input string is valid if: Open brackets must be closed
    * by the same type of brackets. Open brackets must be closed in the
    * correct order. Every close bracket has a corresponding open bracket
    * of the same type.
    * Stack, String
    */
    public boolean isValid(String s)
    {
        if (s.length() % 2 != 0)
        {
            return false;
        }

        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray())
        {
            if (c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if( c == ')' && !stack.isEmpty() && stack.peek() == '(')
            {
                stack.pop();
            }
            else if( c == '}' && !stack.isEmpty() && stack.peek() == '{')
            {
                stack.pop();
            }
            else if( c == ']' && !stack.isEmpty() && stack.peek() == '[')
            {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }// end of method isValid
}
