/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
  /**
    * https://leetcode.com/problems/merge-two-sorted-lists/
    * problem 21 Merge Two Sorted Lists
    * Easy
    * You are given the heads of two sorted linked lists list1 and list2.
    * Merge the two lists in a one sorted list. 
    * The list should be made by splicing together the nodes of
    * the first two lists.
    * Return the head of the merged linked list.
    */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
      ListNode tempNode = new ListNode(0);
      ListNode currNode = tempNode;

      while(list1 != null && list2 != null)
      {
          if(list1.val < list2.val)
          {
              currNode.next = list1;
              list1 = list1.next;
          }
          else
          {
              currNode.next = list2;
              list2 = list2.next;
          }
      }
      if(list1 != null)
      {
          currNode.next = list1;
          list1 = list1.next;
      }
      else if(list2 != null)
      {
          currNode.next = list2;
          list2 = list2.next;
      }
      return tempNode.next;
    }// end of method mergeTwoLists
}// end of class LeetCode
