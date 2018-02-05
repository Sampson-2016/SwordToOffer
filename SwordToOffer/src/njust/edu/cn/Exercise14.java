package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/5
 */
public class Exercise14 {
    /*输入一个整数数组，实现变化顺序：奇数在前，偶数在后*/
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9};
        translate(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int [] array1={2,21};
        translate(array1);
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
    }

    public static void translate(int [] array){
        if (array.length==0||array.length==1){
            return;
        }
        int i=0,j=array.length-1;
        while (i<j){
            while (i<j&&!isOdd(array[i])){
                i++;
            }
            while (i<j&&isOdd(array[j])){
                j--;
            }
            if(i<j){
                swap(array,i,j);
                i++;
                j--;
            }
        }
    }

    private static boolean isOdd(int x){
        return !((x&1)==1);
    }
    private static void swap( int []array,int i, int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }


}
