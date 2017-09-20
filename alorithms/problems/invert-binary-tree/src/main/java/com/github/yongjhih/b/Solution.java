package com.github.yongjhih.b;

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
        root = swap(root);
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }

    TreeNode swap(TreeNode root) {
        TreeNode swap = new TreeNode(root.val);
        swap.left = root.right;
        swap.right = root.left;
        return swap;
    }
}
