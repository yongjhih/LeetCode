package com.github.yongjhih.c;

import com.github.yongjhih.TreeNode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode swap = swap(invertTree(root.left), invertTree(root.right));
        swap.val = root.val;
        return swap;
    }

    TreeNode swap(TreeNode left, TreeNode right) {
        TreeNode swap = new TreeNode(0);
        swap.left = right;
        swap.right = left;
        return swap;
    }
}
