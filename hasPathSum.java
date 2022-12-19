public Class LeetCode
{
  /**
   * https://leetcode.com/problems/path-sum/
   * problem 112 Path Sum
   * Easy
   * Given the root of a binary tree and an integer targetSum,
   * return true if the tree has a root-to-leaf path such that
   * adding up all the values along the path equals targetSum.
   * A leaf is a node with no children.
   * Tree, Depth-First-Search, Breasth-First-Search, Binary tree
   */
   public boolean hasPathSum(TreeNode root, int targetSum) 
   {
        if (root == null) return false;
        if (root.val == targetSum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
   }// end of method hasPathSum
}// end of class LeetCode
