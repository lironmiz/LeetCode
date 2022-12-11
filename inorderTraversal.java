public class LeetCode
{
  /**
   * https://leetcode.com/problems/binary-tree-inorder-traversal/
   * problem 94 Binary Tree Inorder Traversal
   * Easy
   * Given the root of a binary tree, return the
   * inorder traversal of its nodes' values.
   * Stack, Tree, Depth-First-Search, Binary-Tree 
   */
   public List<Integer> inorderTraversal(TreeNode root) 
   {
        Stack<TreeNode> stack = new Stack();
        List<Integer> output_arr = new ArrayList();
        if(root == null)
        {
            return output_arr;
        }
        TreeNode current = root;
        while(current != null || !stack.isEmpty())
        {
            while(current != null)
            {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            output_arr.add(current.val);
            current = current.right;
        }
        return output_arr;
   }// end of method inordertraversal
}// end of class LeetCode
