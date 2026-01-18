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
    private void store(TreeNode p,ArrayList<Integer> list){
        if(p==null){
            list.add(null);
            return;
        }
        list.add(p.val);
        store(p.left,list);
        store(p.right,list);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> list1= new ArrayList<>();
        store(p,list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        store(q,list2);
        return list1.equals(list2);
    }
}