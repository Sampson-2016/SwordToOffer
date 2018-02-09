package njust.edu.cn;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Sampson on 2018/2/8
 */
public class Exercise18 {
    /*树的子结构，输入两颗二叉树A和B，判断B是不是A的子结构*/
    public static void main(String[] args) {
    }

    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null){
            return false;
        }
        if(root1!=null){
            if(HasSubtree1(root1,root2)){
                return true;
            }
            if(HasSubtree(root1.left,root2)){
                return true;
            }
            if(HasSubtree(root1.right,root2)){
                return true;
            }
        }
        return false;
    }

    public static boolean HasSubtree1(TreeNode root1,TreeNode root2) {
        if(root2==null){
            return true;
        }else if(root1==null){
            return false;
        }else if(root1.val==root2.val) {
            return HasSubtree1(root1.left,root2.left)&&HasSubtree1(root1.right,root2.right);
        }else {
            return false;
        }
    }

}

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}