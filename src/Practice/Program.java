package Practice;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

    }
    static boolean isValidBST(TreeNode root) {
        boolean result = false;



        return result;
    }
    static TreeNode rec(TreeNode root){
        if(root == null){
            return null;
        }
        return root;
    }


    //brute-force using inorder traversal
    public boolean isValidBST2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder2(root, list);
        for(int i = 0; i< list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;

    }

    static void inOrder2(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inOrder2(root.left, list);
        list.add(root.val);
        inOrder2(root.right, list);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}