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
    public int goodNodes(TreeNode root) {
        int count[]=new int[1];
        findNodes(root,Integer.MIN_VALUE,count);
        return count[0];
        
    }
    void findNodes(TreeNode root, int max,int count[]){
        if(root==null) return;
        if(root.val>=max){
            count[0]++;
            max=root.val;
        }
        findNodes(root.left,max,count);
        findNodes(root.right,max,count);
    }
}
