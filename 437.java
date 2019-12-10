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
    int ans = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root != null) {
            helper(root, sum, 0);
            pathSum(root.left, sum);
            pathSum(root.right, sum);
        }
        return ans;
    }
    
    private void helper(TreeNode root, int sum, int cur) {
        if(root == null) return;
        cur += root.val;
        if(cur == sum) ans++;
        helper(root.left, sum, cur);
        helper(root.right, sum, cur);
    }
}