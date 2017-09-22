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
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        sum(root, map);
        int max = -1;
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max <  entry.getValue()) {
                max = entry.getValue();
                res.clear();
            }
            if (max == entry.getValue()) {
                res.add(entry.getKey());
            }
        }

        return res.stream().mapToInt(i->i).toArray();
    }
    public int sum(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return 0;

        int sum = sum(root.left, map) + sum(root.right, map) + root.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
}
