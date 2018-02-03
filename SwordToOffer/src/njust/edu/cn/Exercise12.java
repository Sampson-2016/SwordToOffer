package njust.edu.cn;
/**
 * Created by Sampson on 2018/2/3
 */
public class Exercise12 {
    /*输入数字n，按顺序打印出从1到最大的n位十进制数，比如输入3，则打印出1/2/3一直到最大的3位数即999*/
    public static void main(String[] args) {
        print1ToMaxOfNDigits(3);
    }

    public static void print1ToMaxOfNDigits(int n){
        if(n<=0){
            return;
        }
        int[] num = new int[n];
        for (int i = 0; i < 10 ; i++) {
            num[0] =  i;
            print1ToMaxOfNDigitsRecursively(num,n,0);
        }
    }

    private static void print1ToMaxOfNDigitsRecursively(int[] num,int length ,int index){
        if(length-1 == index){
            printNumber(num);
            return;
        }
        for (int i = 0; i <10 ; i++) {
            num[index+1]= i;
            print1ToMaxOfNDigitsRecursively(num,length,index+1);
        }
    }
    private static void printNumber(int[] num){
        int i=0;
        while (i<num.length){
            if(num[i]!=0){
                break;
            }
            i++;
        }
        for (int j = i; j <num.length ; j++) {
            System.out.print(num[j]);
        }
        System.out.print(" ");
    }


}