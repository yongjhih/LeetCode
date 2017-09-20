package com.github.yongjhih;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.*;

import com.github.yongjhih.TreeNode;
import com.github.yongjhih.a.Solution;

import org.junit.Test;

public class MainTests {
    /*
    public static TreeNode tree(List<Integer> values) {
        TreeNode root = new TreeNode();
        TreeNode current = root;
        for (int i = 0; i < values.size(); i++) {
            if (i%3 == 0) {
                current.val = values[i%3]
            } else if (i%3 == 1) {
                current.left = new TreeNode();
                current.left.val = values[i%3];
            } else if (i%3 == 2) {
                current.right = new TreeNode();
                current.right.val = values[i%3];
            }
        }
    }
    */

    @Test
    public void test() {
        //List<Integer> values = Arrays.asList(5,3,6,2,4,null,7);
        //TreeNode tree2 = tree(values)
        TreeNode root = new TreeNode();
        root.val = 5;
        root.left = new TreeNode();
        root.right = new TreeNode();

        root.left.val = 3;
        root.right.val = 6;

        root.left.left = new TreeNode();
        root.left.left.val = 2;
        root.left.right = new TreeNode();
        root.left.right.val = 4;

        root.right.right = new TreeNode();
        root.right.right.val = 7;

        assertTrue(new Solution().findTarget(root, 9));
    }
}