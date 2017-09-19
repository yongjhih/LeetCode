package com.github.yongjhih;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import com.github.yongjhih.TreeNode;
import com.github.yongjhih.a.Solution;

import org.junit.Test;

public class MainTests {
    @Test
    public void test() {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.right = new TreeNode();

        root.left.val = 3;
        root.left.left = new TreeNode();
        root.left.right = new TreeNode();

        root.right.val = 2;

        root.left.left.val = 5;
        root.left.left.left = new TreeNode();

        TreeNode root2 = new TreeNode();

        root2.val = 2;
        root2.left = new TreeNode();
        root2.right = new TreeNode();
        root2.left.val = 1;
        root2.right.val = 3;

        root2.left.right = new TreeNode();
        root2.left.right.val = 4;
        root2.right.right = new TreeNode();
        root2.right.right.val = 7;

        TreeNode r = new Solution().mergeTrees(root, root2);
        assertTrue(r.val == 3);
        assertTrue(r.left.val == 4);
        assertTrue(r.right.val == 5);
        assertTrue(r.left.left.val == 5);
        assertTrue(r.right.right.val == 7);
        assertTrue(r.right.left == null);
    }
}