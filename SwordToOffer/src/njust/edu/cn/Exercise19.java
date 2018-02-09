package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/9
 */
public class Exercise19 {
    /*二叉树的镜像，输入一个二叉树，输出他的镜像*/

    public static void mirro(TreeNode root){
        if(root!=null){
            TreeNode temp = root.left;
            root.left=root.right;
            root.right=temp;
            mirro(root.left);
            mirro(root.right);
        }
    }
}
