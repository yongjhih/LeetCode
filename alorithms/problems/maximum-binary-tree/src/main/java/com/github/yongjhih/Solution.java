package com.github.yongjhih;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int i, int j) {
        int maxI = 0;
        for (int k = i; k < j; k++) {
            if (nums[maxI] < nums[k]) {
                maxI = k;
            }
        }
        TreeNode root = new TreeNode(nums[maxI]);

        root.left = (maxI != 0) ? constructMaximumBinaryTree(nums, i, maxI) : null;
        root.right = (maxI < j - 1) ? constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxI + 1, j)) : null;
        return root;
    }
}
