public class Exercise8 {
    /*旋转数组的最小值*/
    public static void main(String[] args) {
        int a[]={5,6,7,0,1,2,3,4};
        System.out.println(getMin(a,0,a.length-1));
    }

    public static int getMin(int[] array,int start,int end) {
        if(start==end){
            return array[start];
        }else {
            int middle = (start+end)/2 ;
            if(array[start]<array[middle]){
                return getMin(array,middle+1,end);
            }else if(array[start]>array[middle]){
                return getMin(array,start,middle);
            }else {
                return getMin(array,start+1,end);
            }
        }
    }
}
