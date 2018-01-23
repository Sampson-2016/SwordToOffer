public class Exercise6 {
    public static void main(String[] args) {
        int pre[] = {1,2,4,7,3,5,6,8};
        int middle[]={4,7,2,1,5,3,8,6};
        TreeNode node = constructTree(pre,0,pre.length-1,middle,0,middle.length-1);
        print(node);
    }
    public static TreeNode constructTree(int[] pre,int pStart, int pEnd,int[]middle ,int mStart,int mEnd){
        if(pStart<=pEnd){
            TreeNode treeNode =new TreeNode(pre[pStart]);

            int newEnd = mStart;
            while (middle[newEnd]!=pre[pStart]){
                newEnd++;
            }

            treeNode.setLeftNode(constructTree(pre,pStart+1,newEnd-mStart+pStart,middle,mStart,newEnd-1));
            treeNode.setRightNode(constructTree(pre,newEnd-mStart+pStart+1,pEnd,middle,newEnd+1,mEnd));
            return treeNode;
        }
        return null;
    }

    public static void print(TreeNode node){
        if(node.getLeftNode()!=null){
            print(node.getLeftNode());
        }
        if(node.getRightNode()!=null){
            print(node.getRightNode());
        }
        System.out.print(node.getData()+" ");
    }

}
class  TreeNode {
    int data;
    TreeNode leftNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    TreeNode rightNode;

}