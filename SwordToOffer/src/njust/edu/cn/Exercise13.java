package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/4
 */
public class Exercise13 {
    /*给定单向链表的头指针和一个结点指针，定义一个函数在O（1）时间删除该结点*/
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        node1.setData(1);
        node1.setNext(node2);
        node2.setData(2);
        node2.setNext(node3);
        node3.setData(3);
        node3.setNext(node4);
        node4.setData(4);
        node4.setNext(node5);
        node5.setData(5);

        Node node = deleteNode(node1,node1);
        while (node!=null){
            System.out.print(node.getData()+" ");
            node=node.getNext();
        }
    }



    public static Node deleteNode(Node head,Node p){
        if(head==null||p==null){
            return null;
        }
        if(head==p){
            return head.getNext();
        }
        Node prenNode = head;
        Node node = prenNode.getNext();
        while(node!=p){
            prenNode=node;
            node=node.getNext();
        }
        if(node==p){
            prenNode.setNext(node.getNext());
            return head;
        }else {
            return head;
        }
    }



}
class Node{
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}