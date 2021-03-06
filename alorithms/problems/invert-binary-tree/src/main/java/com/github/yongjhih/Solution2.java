package com.github.yongjhih;

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
public class Solution2 {
    // WT recursion is DFS
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode swap = swap(root.left, root.right);
        root.left = swap.left;
        root.right = swap.right;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }

    TreeNode swap(TreeNode left, TreeNode right) {
        TreeNode swap = new TreeNode(0);
        swap.left = right;
        swap.right = left;
        return swap;
    }

    /*
    TreeNode swap(TreeNode left, TreeNode right) {
        TreeNode swap = new TreeNode(0);
        swap.left = right;
        swap.right = left;
        return swap;
    }
    */
}
