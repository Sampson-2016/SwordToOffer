import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Node node1=new Node("A");
        Node node2=new Node("B");
        Node node3=new Node("C");
        Node node4=new Node("D");
        Node node5=new Node("E");
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        reversePrint(node1);
    }


    public  static  void reversePrint(Node node){
        Stack <String> stack =new Stack<String>();
        while (node!=null){
            stack.push(node.getData());
            node = node.getNext();
        }
        while (!stack.empty()){
            System.out.println(stack.pop()+" ");
        }

    }
}
class  Node{
    private    String data;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private   Node next;

}
