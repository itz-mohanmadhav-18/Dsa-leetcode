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

    int idx;
    Map<Integer,Integer> map = new HashMap<>();

    public TreeNode helper(int[] inorder , int[] postorder , int start , int end){
        if(start > end) return null;

        TreeNode node = new TreeNode(postorder[idx]);

        idx--;

        int i = map.get(node.val);

        node.right = helper(inorder,postorder,i+1,end);
        node.left = helper(inorder,postorder,start,i-1);

        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        idx = inorder.length-1;
        int i = 0;
        for(int x : inorder){
            map.put(x,i++);
        }

        return helper(inorder,postorder,0,inorder.length-1);
        
    }
}