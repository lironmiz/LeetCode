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
    * https://leetcode.com/problems/roman-to-integer/
    * Easy
    * problem 13 Roman To Integer
    * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    * Symbol       Value
    *   I             1
    *   V             5
    *   X             10
    *   L             50
    *   C             100
    *   D             500
    *   M             1000
    *   Given a roman numeral, convert it to an integer.
    * Hash table
    */
    public int romanToInt(String s)
    {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if( i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1)))
            {
                result = result + map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }
            else
            {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }// end of method romanToInt
}// end of class LeetCode 
