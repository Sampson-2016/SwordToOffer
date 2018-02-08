package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/7
 */
public class Exercise17 {
    /*合并两个排序的链表*/
    public static Node union(Node headA,Node headB){
        if(headA==null){
            return headB;
        }
        if(headB==null){
            return headA;
        }
        Node head ,node ,other,next;
        if(headA.getData()<headB.getData()){
            head = node = headA;
            other=headB;
        }else {
            head = node =  headB;
            other=headA;
        }
        next = node.getNext();
        while (next!=null){
            if(next.getData()<=other.getData()){
                node = node.getNext();
            }else {
                node.setNext(other);
                node=other;
                other=next;
            }
            next = node.getNext();
        }
        if(next==null){
            node.setNext(other);
        }
        return head;
    }

    public static void main(String[] args) {
        Node head1 = new Node();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        head1.setData(1);
        node1.setData(3);
        node2.setData(6);
        node3.setData(7);
        head1.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        Node head2 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        head2.setData(2);
        node4.setData(4);
        node5.setData(5);
        node6.setData(8);
      // head2.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        Node head = union(head1,head2);
        while (head!=null){
            System.out.print(head.getData()+" ");
            head=head.getNext();
        }
    }


}
