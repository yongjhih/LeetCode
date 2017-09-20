package com.github.yongjhih;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MainTests {
    @Test
    public void test() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(3);
        ListNode result = new Solution().addTwoNumbers(l1, l2);
        assertTrue(result.val == 7);
        assertTrue(result.next.val == 3);
    }
}