package com.github.yongjhih;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0, l1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry, ListNode root) {
        if (l1 == null || l2 == null) return root;

        l1.val = l1.val + l2.val + carry;

        carry = (l1.val >= 10) ? 1 : 0;
        l1.val %= 10;
        if (carry != 0 || l1.next != null || l2.next != null) {
            if (l1.next == null) l1.next = new ListNode(0);
            if (l2.next == null) l2.next = new ListNode(0);
        }
        return addTwoNumbers(l1.next, l2.next, carry, root);
    }
}
