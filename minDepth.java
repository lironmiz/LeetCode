/**
   * https://leetcode.com/problems/minimum-depth-of-binary-tree/
   * problem 111  Minimum Depth of Binary Tree
   * Easy
   * Given a binary tree, find its minimum depth. 
   * The minimum depth is the number of nodes along the shortest
   * path from the root node down to the nearest leaf node.
   * Tree, Depth-First-Search, Breasth-First-Search, Binary tree
   */
   public int minDepth(TreeNode root) 
   {
      if(root == null)
      {
          return 0;
      }
      if(root.left == null)
      {
          return 1 + minDepth(root.right);
      }
      else if (root.right == null)
      {
          return 1 + minDepth(root.left);
      }
      return 1 + Math.min(minDepth(root.left), minDepth(root.right));
  }// end of method minDepth
