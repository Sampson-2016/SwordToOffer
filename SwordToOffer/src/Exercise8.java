public class Exercise8 {
    /*旋转数组的最小值*/
    public static void main(String[] args) {
        int a[]={};
        System.out.println(getMin(a));
    }

    public static int getMin(int[] array) {
        int length = array.length;
        if(length==0){
            try {
                throw new Exception("数组为空");
            }catch (Exception e){
                e.printStackTrace();
            }
            return 0;
        }else if(length==1){
            return array[0];
        }else {
            for (int i = length-2; i >=0; i--) {
                if(array[i]>array[i+1]){
                    return array[i+1];
                }
            }
            return array[0];
        }
    }
}
