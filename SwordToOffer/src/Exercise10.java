/**
 * Created by Sampson on 2018/2/1
 */
public class Exercise10 {
    /*输入整数，输出该二进制的表示中1的个数，如9的二进制是1001，输出2.*/
    /*内存中的数是以补码形式存放。如int 9 为 0000 0000 0000 1001 ，若-1，取正数的原码0000 0000 0000 0001，取反1111 1111 1111 1110，+1 ，为1111 1111 1111 1111*/
    public static void main(String[] args) {
        System.out.println(count(9));
        System.out.println(count(-8));
        System.out.println(count(-9));
        System.out.println(count(-1));
        System.out.println(count1(9));
        System.out.println(count1(-8));
        System.out.println(count1(-9));
        System.out.println(count1(-1));
        System.out.println(count2(9));
        System.out.println(count2(-8));
        System.out.println(count2(-9));
        System.out.println(count2(-1));
    }

    public  static int count(int data){ /*当输入为负数，会无限循环*/
        int n=0;
        while (data!=0){
            if((data&1)==1){
                n++;
            }
            data=data>>>1;
        }
        return n;
    }

    public static int count1(int data){
        int n=0,m=32;
        int flag=1;
        while (m>0){
            int a = flag&data;
            if((flag&data)==flag) {
                n++;
            }
            flag = flag << 1;
            m--;
        }
        return n;
    }

    public static int count2(int data){
        int n=0;
        while (data!=0){
            n++;
            data=data&(data-1);
        }
        return n;

    }

}
