import java.util.Stack;

public class Exercise7
{
    /*两个栈实现队列，实现两个函数appendTail和deleteHead，分别完成队列尾部插入结点和在队列头部删除结点功能*/
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.appendTail(1);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }

}

class MyQueue{
    private Stack in;
    private Stack out;
    public MyQueue(){
        in = new Stack();
        out = new Stack();
    }
    public void appendTail(Object data){
        in.push(data);
    }
    public Object deleteHead(){
        if(!out.isEmpty()){
            return  out.pop();
        }else if(!in.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
            return out.pop();
        }else {
            return null; /*队列为空时返回null*/
        }
    }
}
