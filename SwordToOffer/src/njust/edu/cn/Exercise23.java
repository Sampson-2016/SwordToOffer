package njust.edu.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sampson on 2018/2/12
 */
public class Exercise23 {
    /*从上往下打印二叉树*/
    public static ArrayList printFromTopToBottom(TreeNode root) {
        Queue queue = new LinkedList();
        ArrayList arrayList=new ArrayList();
        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = (TreeNode) queue.remove();
                System.out.print(node.val+" ");
                arrayList.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {

    }
}
