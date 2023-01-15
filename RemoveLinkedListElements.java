/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
   /**
    * https://leetcode.com/problems/remove-linked-list-elements/
	  * problem 203 Remove Linked List Elements
    * Easy
	  * Given the head of a linked list and an integer val, remove all the nodes of the
	  * linked list that has Node.val == val, and return the new head.
    * Linked List, Recursion 
    */
    public ListNode removeElements(ListNode head, int val)
    {
        while(head != null && head.val == val)
        {
            head = head.next;
        }
       ListNode curr_node = head;
       while(curr_node != null && curr_node. next != null)
       {
           if(curr_node.next.val == val)
           {
               curr_node.next = curr_node.next.next;
           }
           else
           {
               curr_node = curr_node.next;
           }
       }
       return head;
    }// end of method removeElements 
}// end of class LeetCode
