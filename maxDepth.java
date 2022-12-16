public class Leetcode
{
  /**
   * https://leetcode.com/problems/maximum-depth-of-binary-tree/
   * problem 104 Maximum Depth of Binary Tree
   * Easy
   * Given the root of a binary tree, return its maximum depth. 
   * A binary tree's maximum depth is the number of
   * nodes along the longest path from the root node down to
   * the farthest leaf node.
   * Tree, Depth-First-Search, Binary-Tree, Breadth-First-Search
   */
   public int maxDepth(TreeNode root) 
   {
       if(root == null)
       {
           return 0;
       }
       int left = maxDepth(root.left);
       int right = maxDepth(root.right);
       return Math.max(left, right) + 1;
   }// end of method maxDepth
}// end of class LeetCode
