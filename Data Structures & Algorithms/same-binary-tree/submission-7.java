/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (p.left != null && !isSameTree(p.left, q.left)) {
            return false;
        } else if (p.right != null && !isSameTree(p.right, q.right)) {
            return false;
        }

        if (q.left != null && p.left == null) {
            return false;
        } else if (q.right != null && p.right == null) {
            return false;
        }

        return true;
    
    }
}
