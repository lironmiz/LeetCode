public class LeetCode
{
  /**
    * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
    * problem 83 Remove Duplicates from Sorted List
    * Easy
    *Given the head of a sorted linked list, delete all duplicates
    *such that each element appears only once.
    *Return the linked list sorted as well.
    */
   public ListNode deleteDuplicates(ListNode head)
   {
        ListNode currentNode = head;

        while(currentNode != null && currentNode.next != null)
        {
          if(currentNode.next.val == currentNode.val)
          {
              currentNode.next = currentNode.next.next;
          }
          else
          {
              currentNode = currentNode.next;
          }
        }
        return head;
   }// end of method deleteDuplicates
}// end of class LeetCode
