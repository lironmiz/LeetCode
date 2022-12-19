public class Leetcode
{
  /**
   * https://leetcode.com/problems/pascals-triangle/
   * problem 118 Pascal's Triangle
   * Easy
   * Given an integer numRows, return the first numRows of Pascal's triangle. 
   * In Pascal's triangle, each number is the sum of the two numbers
   * directly above it as shown:
   * Array, Dynamic Programing 
   */
   public List<List<Integer>> generate(int numRows) 
   {
        List<List<Integer>> triangleList = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangleList.add(first_row);

        for(int i=1; i < numRows; i++)
        {
            List<Integer> prev_row = triangleList.get(i -1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);
            for(int j = 1; j < i; j++)
            {
                currRow.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            currRow.add(1);
            triangleList.add(currRow);   
        }
        return triangleList;
   }// end of method generate
}// end of class LeetCode
