/*/**
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
 *//* 
class Solution {
    int ans;
    public int calcHeight(TreeNode root){
       if(root == null){
        return 0;
       }
       
       int l= calcHeight(root.right);
       int r= calcHeight(root.left);
       
       ans = Math.max(ans,(l+r));
       return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        calcHeight(root);
        return ans;
    }
} */
