

```python
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root: return True
        return self.isMirror(root.left, root.right)

    def isMirror(self, left, right):
        if not left or not right: return left is right
        if left.val != right.val: return False
        return self.isMirror(left.left, right.right) and self.isMirror(left.right, right.left)

```
