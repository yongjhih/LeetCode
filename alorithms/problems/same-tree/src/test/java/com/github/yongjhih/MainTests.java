package com.github.yongjhih;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MainTests {
    @Test
    public void test() {
        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(7);
        assertTrue(new Solution().isSameTree(p, q));
    }
}