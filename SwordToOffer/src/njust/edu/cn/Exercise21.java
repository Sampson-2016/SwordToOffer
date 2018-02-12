package njust.edu.cn;

import java.util.Stack;

/**
 * Created by Sampson on 2018/2/12
 */
public class Exercise21 {
    /*
    * 定义栈的数据结构，请在该类型中实现一个能得到栈最小元素的min函数。调用min,push,pop的时间复杂度都是O(1)*/
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(3);
        myStack.push(0);

        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
    }


}
class MyStack {
    Stack A;
    Stack B;
    public MyStack(){
        A = new Stack();
        B = new Stack();
    }

    public void push(Object item){
        A.push(item);
        if(B.empty()){
            B.push(item);
        }else if(compare(B.peek(),item)){
            B.push(item);
        }
    }

    public Object pop(){

        if(compare(B.peek(),A.peek())){
            B.pop();
        }
        return A.pop();
    }

    public Object min(){
        if(B.empty()){
            return null;
        }
        return B.peek();
    }

    /*i>=j时返回true*/
    public boolean  compare(Object i,Object j){
        if(i instanceof Integer){
            if((int)i>=(int)j){
                return true;
            }else {
                return false;

            }
        }else {
            /*其他类型的比较方式*/
            return true;
        }

    }

}