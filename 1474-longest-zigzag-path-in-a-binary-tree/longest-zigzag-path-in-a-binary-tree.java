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
    int maxZigZagLength=0;
    public int longestZigZag(TreeNode root) {
         maxZigZagLength = 0;
        dfs(root, 0, 0);
        return maxZigZagLength;
        
    }
     private void dfs(TreeNode node, int leftCount, int rightCount) {
        // Base case: if node is null, return
        if (node == null) {
            return;
        }
    
        // Update the maximum zigzag length found so far
        maxZigZagLength = Math.max(maxZigZagLength, Math.max(leftCount, rightCount));
      
        // Traverse left child:
        // - If we go left, the previous zigzag came from right, so pass rightCount + 1
        // - Reset the other direction to 0 since we're starting a new path
        dfs(node.left, rightCount + 1, 0);
      
        // Traverse right child:
        // - If we go right, the previous zigzag came from left, so pass leftCount + 1
        // - Reset the other direction to 0 since we're starting a new path
        dfs(node.right, 0, leftCount + 1);
    }
}