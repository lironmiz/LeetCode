public class LeetCode
{
  /**
   * https://leetcode.com/problems/symmetric-tree/
   * problem 101 Symmetric Tree
   * Easy
   * Given the root of a binary tree, check whether it is a mirror of itself
   * (i.e., symmetric around its center).
   * Tree, Depth-First-Search, Binary-Tree, Breadth-First-Search
   */
   public boolean isSymmetric(TreeNode root) 
   {
      return isMirror(root, root);      
   }// end of method isSymmetric 
   public boolean isMirror(TreeNode tree1, TreeNode tree2)
   {
        if(tree1 == null && tree2 == null)
        {
            return true;
        }
        if(tree1 == null || tree2 == null)
        {
            return false;
        }
        return (tree1.val == tree2.val) && isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);
   }// end of method isMirror
}// end of class LeetCode
