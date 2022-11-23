import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/**
* Class LeetCode.java
* A class with solutions to leet code problems 
*/
public class LeetCode
{
  /**
    * https://leetcode.com/problems/add-two-numbers/
    * problem 2 Add Two Numbers 
    * Definition for singly-linked list.
    * You are given two non-empty linked lists
    * representing two non-negative integers.
    * The digits are stored in reverse order,
    * and each of their nodes contains a single digit.
    * Add the two numbers and return the sum as a linked list.
    * public class ListNode
    * {
    *     int val;
    *     ListNode next;
    *     ListNode() {}
    *     ListNode(int val) { this.val = val; }
    *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    * }
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummyHead =  new ListNode(0);
        ListNode l3 = dummyHead;

        int carry = 0;
        while(l1 != null || l2 != null)
        {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            int currSum = l1_val + l2_val + carry;
            carry = currSum / 10;
            int lastDigit = currSum % 10;

            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;

            if(l1 != null)
            {
                l1 = l1.next;
            }

            if(l2 != null)
            {
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if( carry > 0)
        {
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }
        return dummyHead.next;
    }// end of method addTwoNumbers





}
