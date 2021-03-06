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
        root.val = 4;
        root.left = new TreeNode();
        root.right = new TreeNode();

        root.left.val = 2;
        root.left.left = new TreeNode();
        root.left.right = new TreeNode();

        root.right.val = 7;
        root.right.left = new TreeNode();
        root.right.right = new TreeNode();

        root.left.left.val = 1;
        root.left.left.left = new TreeNode();
        root.left.left.right = new TreeNode();

        root.left.right.val = 3;
        root.left.right.left = null;
        root.left.right.right = null;

        root.right.left.val = 6;
        root.right.left.left = new TreeNode();
        root.right.left.right = new TreeNode();

        root.right.right.val = 9;
        root.right.right.left = null;
        root.right.right.right = null;

        //assertTrue()
    }
}