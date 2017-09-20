package com.github.yongjhih.a;

import com.github.yongjhih.TreeNode;
import java.util.*;
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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        return findTarget(root, k, new HashSet<>());
    }
    public boolean findTarget(TreeNode root, int k, final HashSet set) {
        if (root == null) return false;

        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return findTarget(root.left, k, set) || findTarget(root.right, k, set);
    }
}
