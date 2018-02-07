package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/7
 */
public class Exercise16 {
    /*反转链表*/
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
        Node indexNode = reserve(node1);
        while (indexNode!=null){
            System.out.println(indexNode.getData());
            indexNode = indexNode.getNext();
        }
    }

    public static Node reserve(Node head) {
        if(head==null||head.getNext()==null){
            return head;
        }
        Node preNode = head;
        Node node= preNode.getNext();
        Node nextNode = node.getNext();
        preNode.setNext(null);
        while (nextNode!=null){
            node.setNext(preNode);
            preNode=node;
            node=nextNode;
            nextNode=nextNode.getNext();
        }
        node.setNext(preNode);
        return node;
    }


}
