/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
    /**
    * https://leetcode.com/problems/excel-sheet-column-title/
    * Easy
    * problem 168 Excel Sheet column Title 
    * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
    * Math, String
    */
    public String convertToTitle(int columnNumber)
    {
        String str = "";

        while(columnNumber > 0)
        {
            columnNumber--;
            str = (char) (columnNumber%26 + 'A') + str;
            columnNumber = columnNumber / 26;
        }
        return str;
    }// end of method convertToTitle
}// end of class LeetCode
