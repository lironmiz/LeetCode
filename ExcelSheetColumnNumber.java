import java.util.HashMap;

/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
   /**
    * https://leetcode.com/problems/excel-sheet-column-number/
    * Easy
    * problem 171 Excel Sheet Column Number
	  * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
    * Math, String
    */
    public int titleToNumber(String columnTitle)
    {
        int result = 0;
        for(char c : columnTitle.toCharArray())
        {
            int d = c - 'A' + 1;
            result = result*26 + d;
        }
        return result;    
    }// end of method titleToNumber
}// end of class LeetCode
