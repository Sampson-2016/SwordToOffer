package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/7
 */
public class Exercise15 {
    /*链表中倒数第k个数*/
    public static Node getLastKNode(int k,Node head){
        if(k<=0){
            return null;
        }
        Node delayNode = head;
        Node preNode = head;
        int i=0;
        while (preNode!=null){
            i++;
            preNode = preNode.getNext();
            if(i>k){
                delayNode = delayNode.getNext();
            }
        }
        if(i<k){
            return null;
        }
        return delayNode;
    }


    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        node1.setData(5);
        node1.setNext(node2);
        node2.setData(4);
        node2.setNext(node3);
        node3.setData(3);
        node3.setNext(node4);
        node4.setData(2);
        node4.setNext(node5);
        node5.setData(1);

        getLastKNode(6,node1);
    }
}
