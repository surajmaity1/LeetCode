package LeetCode;

public class DBT {
    //https://leetcode.com/problems/diameter-of-binary-tree/

    public int diameterOfBinaryTree1(TreeNode root) {
        int[] diameter = new int[1];
        diameterCalculate1(root, diameter);
        return diameter[0];
    }
    public int diameterCalculate1(TreeNode root, int[] diameter){
        if(root == null) return 0;

        int left = diameterCalculate1(root.left, diameter);
        int right = diameterCalculate1(root.right, diameter);

        diameter[0] = Math.max(diameter[0], (left+right));

        return 1 + Math.max(left, right);
    }
}
