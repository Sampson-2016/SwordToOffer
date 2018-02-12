package njust.edu.cn;

import java.util.Stack;

/**
 * Created by Sampson on 2018/2/12
 */
public class Exercise22 {
    /*栈的压入、弹出序列。 第一个序列表示栈的压入顺序，判断第二个序列是否是该栈的弹出序列*/

    /*
    * funtion:判断b是否是a的输出
    * parameter:a是压入，b是弹出
    * throw:
    */
    public static boolean check(int a[],int b[]){
        int aLen =a.length;
        int bLen = b.length;
        if(aLen!=bLen||aLen==0){
            return false;
        }
        int aIndex=0,bIndex=0;
        Stack stack=new Stack();
        while (aIndex<aLen){
            stack.push(a[aIndex]);
            while (!stack.empty()&&((int)stack.peek()==b[bIndex])){
                stack.pop();
                bIndex++;
            }
            aIndex++;
        }
        if(stack.empty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b1[]={2,1,4,3,5};
        int b2[]={4,3,5,1,2};
        int b3[]={5,4,3,2,1};
        System.out.println(check(a,b1));
        System.out.println(check(a,b2));
        System.out.println(check(a,b3));

    }
}
