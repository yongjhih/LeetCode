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
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        return swap(invertTree(root.left), invertTree(root.right), root);
    }

    TreeNode swap(TreeNode left, TreeNode right, TreeNode root) {
        root.left = right;
        root.right = left;
        return root;
    }
}
