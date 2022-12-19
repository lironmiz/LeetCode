public class LeetCode
{
  /**
   * https://leetcode.com/problems/balanced-binary-tree/
   * problem 110  Balanced Binary Tree
   * Easy
   * Given a binary tree, determine if it is height-balanced
   * Tree, Depth-First-Search, Binary tree
   */
  private int getHeight(TreeNode tree)
    {
        if(tree == null)
        {
            return 0;
        }
        int left = getHeight(tree.left);
        int right = getHeight(tree.right);
        int bf = Math.abs(left - right);
        if(bf > 1 || left == -1 || right == -1)
        {
            return -1;
        }
        return 1 + Math.max(left, right);
    }// end of method getHeight
   public boolean isBalanced(TreeNode root)
   {
        if(root == null)
        {
            return true;
        }
        return getHeight(root) != -1;
   }// end of method isBalanced
}end of class LeetCode
