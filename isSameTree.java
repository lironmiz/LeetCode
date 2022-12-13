public class LeetCode
{
 /**
   * https://leetcode.com/problems/same-tree/
   * problem 100 Same Tree
   * Easy
   * Given the roots of two binary trees p and q, write a function
   * to check if they are the same or not. Two binary trees are
   * considered the same if they are structurally identical, and the
   * nodes have the same value.
   * Tree, Depth-First-Search, Binary-Tree, Breadth-First-Search
   */
   public boolean isSameTree(TreeNode p, TreeNode q) 
   {
        if(p == null && q == null)
        {
            return true;
        }
        else if(p == null || q == null)
        {
            return false;
        }
        else if(p.val != q.val)
        {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
   }// end of method isSameTree
}// end of class LeetCode
