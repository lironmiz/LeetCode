public class LeetCode
{
  /**
   * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
   * problem 108 Convert Sorted Array to Binary Search Tree
   * Easy
   * Given an integer array nums where the elements are sorted
   * in ascending order, convert it to a height-balanced
   * binary search tree.
   * Array, Divide and Conquer. Tree, Binary-Tree
   */
   public TreeNode sortedArrayToBST(int[] nums) 
   {
        if(nums.length == 0)
        {
            return null;
        }
        return constructTreeFromArray(nums, 0, nums.length - 1);
   }// end of method sorted array to BST
   public TreeNode constructTreeFromArray(int[] nums, int left, int right)
   {
        if(left > right)
        {
            return null;
        }
        int midpoint = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = constructTreeFromArray(nums, left, midpoint -1);
        node.right = constructTreeFromArray(nums, midpoint + 1, right);
        return node;

   }// end of method construct tree from array
}// end of class LeetCode
