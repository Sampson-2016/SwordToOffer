package njust.edu.cn;

/**
 * Created by Sampson on 2018/2/26
 */
public class Exercise24 {
    /**
     * 输入一个整数数组，
     * 判断该数组是不是某二叉搜索树的后序遍历的结果。
     * 如果是则返回true，否则返回false。
     * 假设输入的数组的任意两个数字都互不相同
     */

    public static boolean checkIsPostTraversing(int [] array){
        if(array.length==0){
            return false;
        }else if(array.length==1){
            return true;
        }else {
            return checkIsPostTraversing(array,0,array.length-1);
        }
    }

    public static boolean checkIsPostTraversing(int [] array,int start,int end){
        if((end-start)==1||start==end){
            return true;
        }else {
            int index = start;
            while ((index<end)&&array[index]<array[end]) {
                index++;
            }
            if(end==index||end-index==1){
                return checkIsPostTraversing(array,start,index-1);
            }else {
                int i=index;
                while (i<end&&array[i]>array[end]){
                    i++;
                }
                if(i!=end){
                    return false;
                }else if(index!=start){
                    return checkIsPostTraversing(array,start,index-1)&&checkIsPostTraversing(array,index,end-1);
                }else {
                    return checkIsPostTraversing(array,index,end-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int array1[] = {1,3,4,2,6,8,7,10,9,5};
        System.out.println(checkIsPostTraversing(array1));

        int array2[] = {1,2,3 };
        System.out.println(checkIsPostTraversing(array2));

        int array3[] = {5,4,1};
        System.out.println(checkIsPostTraversing(array3));

        int array4[] = {1,6,2,7,5};
        System.out.println(checkIsPostTraversing(array4));

    }
}
