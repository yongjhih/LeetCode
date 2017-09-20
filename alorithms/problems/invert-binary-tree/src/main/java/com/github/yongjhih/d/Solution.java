package com.github.yongjhih.d;

import com.github.yongjhih.TreeNode;
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode swap = new TreeNode(root.val);
        swap.left = invertTree(root.right);
        swap.right =  invertTree(root.left);
        return swap;
    }
}
